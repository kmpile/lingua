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

package com.kmpile.lingua.internal.util.extension

// Insertion-ordered map/set builders. These used to return java.util.EnumMap/EnumSet; plain
// LinkedHashMap/LinkedHashSet are multiplatform and behave identically for this library's use
// (membership and per-key lookups; iteration order is never relied upon for detection results).
internal fun <K, V> enumMapOf(vararg pairs: Pair<K, V>): MutableMap<K, V> =
    LinkedHashMap<K, V>().apply { putAll(pairs) }

internal fun <E> enumSetOf(vararg elements: E): Set<E> = LinkedHashSet(elements.asList())
