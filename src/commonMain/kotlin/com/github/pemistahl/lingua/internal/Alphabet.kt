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

import com.github.pemistahl.lingua.api.Language

internal enum class Alphabet {
    ARABIC,
    ARMENIAN,
    BENGALI,
    CYRILLIC,
    DEVANAGARI,
    ETHIOPIC,
    GEORGIAN,
    GREEK,
    GUJARATI,
    GURMUKHI,
    HAN,
    HANGUL,
    HEBREW,
    HIRAGANA,
    KATAKANA,
    LATIN,
    SINHALA,
    TAMIL,
    TELUGU,
    THAI,
    NONE,
    ;

    // Every constant except NONE shares its name with a java.lang.Character.UnicodeScript constant
    // (and the equivalent script name on other platforms), so a code point belongs to this alphabet
    // exactly when its script name equals this constant's name. NONE never matches a real script.
    fun matches(chr: Char): Boolean = unicodeScriptName(chr.code) == name

    fun matches(input: CharSequence): Boolean {
        var i = 0
        while (i < input.length) {
            val codePoint = codePointAt(input, i)
            if (unicodeScriptName(codePoint) != name) return false
            i += if (codePoint >= 0x10000) 2 else 1
        }
        return true
    }

    private fun supportedLanguages(): Set<Language> {
        val languages = mutableSetOf<Language>()
        for (language in Language.entries) {
            if (language.alphabets.contains(this)) {
                languages.add(language)
            }
        }
        return languages
    }

    companion object {
        fun allSupportingExactlyOneLanguage(): Map<Alphabet, Language> {
            val alphabets = mutableMapOf<Alphabet, Language>()
            for (alphabet in entries.filterNot { it == NONE }) {
                val supportedLanguages = alphabet.supportedLanguages()
                if (supportedLanguages.size == 1) {
                    alphabets[alphabet] = supportedLanguages.first()
                }
            }
            return alphabets
        }
    }
}

private fun codePointAt(
    input: CharSequence,
    index: Int,
): Int {
    val high = input[index]
    if (high.isHighSurrogate() && index + 1 < input.length) {
        val low = input[index + 1]
        if (low.isLowSurrogate()) {
            return 0x10000 + ((high.code - 0xD800) shl 10) + (low.code - 0xDC00)
        }
    }
    return high.code
}
