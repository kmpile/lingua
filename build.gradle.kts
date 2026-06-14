/*
 * Copyright © 2018-today Peter M. Stahl pemistahl@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.konan.target.HostManager

val linguaGroupId: String by project
val linguaName: String by project
val linguaDescription: String by project
val linguaLicenseName: String by project
val linguaLicenseUrl: String by project
val linguaWebsiteUrl: String by project
val linguaDeveloperId: String by project
val linguaDeveloperName: String by project
val linguaDeveloperEmail: String by project
val linguaDeveloperUrl: String by project
val linguaScmConnection: String by project
val linguaScmDeveloperConnection: String by project
val linguaScmUrl: String by project
val linguaMainClass: String by project
val githubPackagesUrl: String by project

group = linguaGroupId
description = linguaDescription

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.android.kmp.library)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.dokka)
    alias(libs.plugins.dokka.javadoc)
    alias(libs.plugins.shadow)
    alias(libs.plugins.nexus.publish)
    `maven-publish`
    signing
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
kotlin {
    // Provision the exact JDK for compilation and the test suite via the foojay resolver
    // (settings.gradle.kts), so the build no longer depends on the machine's installed JDK.
    jvmToolchain(
        libs.versions.jvmTarget
            .get()
            .toInt(),
    )

    // Target set mirrors kmpile/llama.cpp-kmp. The Apple targets only build on a macOS host, so
    // they are declared only there; non-mac builds (and Windows CI) compile the rest.
    android {
        namespace = "com.kmpile.lingua"
        compileSdk =
            libs.versions.compileSdk
                .get()
                .toInt()
        minSdk =
            libs.versions.minSdk
                .get()
                .toInt()
        // Android bytecode cannot target 25 the way the desktop JVM does; cap lower like the
        // other kmpile Android libraries.
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(libs.versions.androidJvmTarget.get()))
        }
    }

    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(libs.versions.jvmTarget.get()))
        }
    }

    wasmJs {
        browser()
    }

    if (HostManager.hostIsMac) {
        iosX64()
        iosArm64()
        iosSimulatorArm64()
        macosArm64()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.atomicfu)
        }
        jvmTest.dependencies {
            implementation(libs.junit.jupiter)
            implementation(libs.assertj.core)
            implementation(libs.mockk)
            runtimeOnly(libs.junit.platform.launcher)
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform { failFast = true }
}

dokka {
    dokkaSourceSets.configureEach {
        jdkVersion.set(25)
        reportUndocumented.set(false)
        perPackageOption {
            matchingRegex.set(".*\\.(app|internal).*")
            suppress.set(true)
        }
    }
}

tasks.register<Jar>("dokkaJavadocJar") {
    group = "Build"
    description = "Assembles a jar archive containing Javadoc documentation."
    archiveClassifier.set("javadoc")
    from(tasks.named("dokkaGeneratePublicationJavadoc"))
}

tasks.register<ShadowJar>("jarWithDependencies") {
    group = "Build"
    description = "Assembles a jar archive containing the main classes and all external dependencies."
    archiveClassifier.set("with-dependencies")
    from(
        kotlin
            .jvm()
            .compilations
            .getByName("main")
            .output.allOutputs,
    )
    configurations = listOf(project.configurations.getByName("jvmRuntimeClasspath"))
    manifest { attributes("Main-Class" to linguaMainClass) }
}

tasks.register<JavaExec>("runLinguaOnConsole") {
    group = "application"
    description = "Starts a REPL (read-evaluate-print loop) to try Lingua on the command line."
    mainClass.set(linguaMainClass)
    standardInput = System.`in`
    classpath =
        files(
            kotlin
                .jvm()
                .compilations
                .getByName("main")
                .output.allOutputs,
            project.configurations.getByName("jvmRuntimeClasspath"),
        )
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        pom {
            name.set(linguaName)
            description.set(linguaDescription)
            url.set(linguaWebsiteUrl)

            licenses {
                license {
                    name.set(linguaLicenseName)
                    url.set(linguaLicenseUrl)
                }
            }
            developers {
                developer {
                    id.set(linguaDeveloperId)
                    name.set(linguaDeveloperName)
                    email.set(linguaDeveloperEmail)
                    url.set(linguaDeveloperUrl)
                }
            }
            scm {
                connection.set(linguaScmConnection)
                developerConnection.set(linguaScmDeveloperConnection)
                url.set(linguaScmUrl)
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri(githubPackagesUrl)
            credentials {
                username = linguaDeveloperId
                password = project.findProperty("ghPackagesToken") as String?
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype()
    }
}

signing {
    isRequired = false
    sign(publishing.publications)
}
