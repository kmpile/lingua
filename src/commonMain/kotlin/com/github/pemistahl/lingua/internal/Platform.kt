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

package com.github.pemistahl.lingua.internal

/**
 * Returns the canonical Unicode script name (e.g. "LATIN", "CYRILLIC", "HAN") of the given
 * code point, or `null` if it cannot be determined. The names match the enum-constant names of
 * [Alphabet] and the JVM's `java.lang.Character.UnicodeScript`.
 */
internal expect fun unicodeScriptName(codePoint: Int): String?

/**
 * Reads the bundled language-model JSON resource at [filePath], or returns `null` if it is absent.
 */
internal expect fun readLanguageModelJson(filePath: String): String?

/**
 * Runs the given [tasks], potentially in parallel, and returns their results in order.
 */
internal expect fun <T> runTasksInParallel(tasks: List<() -> T>): List<T>
