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

package com.kmpile.lingua.api

import com.kmpile.lingua.api.Language.AFRIKAANS
import com.kmpile.lingua.api.Language.ALBANIAN
import com.kmpile.lingua.api.Language.AMHARIC
import com.kmpile.lingua.api.Language.ARABIC
import com.kmpile.lingua.api.Language.ARMENIAN
import com.kmpile.lingua.api.Language.AZERBAIJANI
import com.kmpile.lingua.api.Language.BASQUE
import com.kmpile.lingua.api.Language.BELARUSIAN
import com.kmpile.lingua.api.Language.BENGALI
import com.kmpile.lingua.api.Language.BOKMAL
import com.kmpile.lingua.api.Language.BOSNIAN
import com.kmpile.lingua.api.Language.BULGARIAN
import com.kmpile.lingua.api.Language.CATALAN
import com.kmpile.lingua.api.Language.CHINESE
import com.kmpile.lingua.api.Language.CROATIAN
import com.kmpile.lingua.api.Language.CZECH
import com.kmpile.lingua.api.Language.DANISH
import com.kmpile.lingua.api.Language.DUTCH
import com.kmpile.lingua.api.Language.ENGLISH
import com.kmpile.lingua.api.Language.ESPERANTO
import com.kmpile.lingua.api.Language.ESTONIAN
import com.kmpile.lingua.api.Language.FINNISH
import com.kmpile.lingua.api.Language.FRENCH
import com.kmpile.lingua.api.Language.GANDA
import com.kmpile.lingua.api.Language.GEORGIAN
import com.kmpile.lingua.api.Language.GERMAN
import com.kmpile.lingua.api.Language.GREEK
import com.kmpile.lingua.api.Language.GUJARATI
import com.kmpile.lingua.api.Language.HEBREW
import com.kmpile.lingua.api.Language.HINDI
import com.kmpile.lingua.api.Language.HUNGARIAN
import com.kmpile.lingua.api.Language.ICELANDIC
import com.kmpile.lingua.api.Language.INDONESIAN
import com.kmpile.lingua.api.Language.IRISH
import com.kmpile.lingua.api.Language.ITALIAN
import com.kmpile.lingua.api.Language.JAPANESE
import com.kmpile.lingua.api.Language.KAZAKH
import com.kmpile.lingua.api.Language.KOREAN
import com.kmpile.lingua.api.Language.LATIN
import com.kmpile.lingua.api.Language.LATVIAN
import com.kmpile.lingua.api.Language.LITHUANIAN
import com.kmpile.lingua.api.Language.MACEDONIAN
import com.kmpile.lingua.api.Language.MALAY
import com.kmpile.lingua.api.Language.MAORI
import com.kmpile.lingua.api.Language.MARATHI
import com.kmpile.lingua.api.Language.MONGOLIAN
import com.kmpile.lingua.api.Language.NYNORSK
import com.kmpile.lingua.api.Language.OROMO
import com.kmpile.lingua.api.Language.PERSIAN
import com.kmpile.lingua.api.Language.POLISH
import com.kmpile.lingua.api.Language.PORTUGUESE
import com.kmpile.lingua.api.Language.PUNJABI
import com.kmpile.lingua.api.Language.ROMANIAN
import com.kmpile.lingua.api.Language.RUSSIAN
import com.kmpile.lingua.api.Language.SERBIAN
import com.kmpile.lingua.api.Language.SHONA
import com.kmpile.lingua.api.Language.SINHALA
import com.kmpile.lingua.api.Language.SLOVAK
import com.kmpile.lingua.api.Language.SLOVENE
import com.kmpile.lingua.api.Language.SOMALI
import com.kmpile.lingua.api.Language.SOTHO
import com.kmpile.lingua.api.Language.SPANISH
import com.kmpile.lingua.api.Language.SWAHILI
import com.kmpile.lingua.api.Language.SWEDISH
import com.kmpile.lingua.api.Language.TAGALOG
import com.kmpile.lingua.api.Language.TAMIL
import com.kmpile.lingua.api.Language.TELUGU
import com.kmpile.lingua.api.Language.THAI
import com.kmpile.lingua.api.Language.TIGRINYA
import com.kmpile.lingua.api.Language.TSONGA
import com.kmpile.lingua.api.Language.TSWANA
import com.kmpile.lingua.api.Language.TURKISH
import com.kmpile.lingua.api.Language.UKRAINIAN
import com.kmpile.lingua.api.Language.UNKNOWN
import com.kmpile.lingua.api.Language.URDU
import com.kmpile.lingua.api.Language.VIETNAMESE
import com.kmpile.lingua.api.Language.WELSH
import com.kmpile.lingua.api.Language.XHOSA
import com.kmpile.lingua.api.Language.YORUBA
import com.kmpile.lingua.api.Language.ZULU
import com.kmpile.lingua.internal.Alphabet
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class LanguageTest {
    @Test
    fun `assert that all supported languages are available`() {
        assertThat(Language.all()).containsExactly(
            AFRIKAANS,
            ALBANIAN,
            AMHARIC,
            ARABIC,
            ARMENIAN,
            AZERBAIJANI,
            BASQUE,
            BELARUSIAN,
            BENGALI,
            BOKMAL,
            BOSNIAN,
            BULGARIAN,
            CATALAN,
            CHINESE,
            CROATIAN,
            CZECH,
            DANISH,
            DUTCH,
            ENGLISH,
            ESPERANTO,
            ESTONIAN,
            FINNISH,
            FRENCH,
            GANDA,
            GEORGIAN,
            GERMAN,
            GREEK,
            GUJARATI,
            HEBREW,
            HINDI,
            HUNGARIAN,
            ICELANDIC,
            INDONESIAN,
            IRISH,
            ITALIAN,
            JAPANESE,
            KAZAKH,
            KOREAN,
            LATIN,
            LATVIAN,
            LITHUANIAN,
            MACEDONIAN,
            MALAY,
            MAORI,
            MARATHI,
            MONGOLIAN,
            NYNORSK,
            OROMO,
            PERSIAN,
            POLISH,
            PORTUGUESE,
            PUNJABI,
            ROMANIAN,
            RUSSIAN,
            SERBIAN,
            SHONA,
            SINHALA,
            SLOVAK,
            SLOVENE,
            SOMALI,
            SOTHO,
            SPANISH,
            SWAHILI,
            SWEDISH,
            TAGALOG,
            TAMIL,
            TELUGU,
            THAI,
            TIGRINYA,
            TSONGA,
            TSWANA,
            TURKISH,
            UKRAINIAN,
            URDU,
            VIETNAMESE,
            WELSH,
            XHOSA,
            YORUBA,
            ZULU,
        )
    }

    @Test
    fun `assert that all supported spoken languages are available`() {
        assertThat(Language.allSpokenOnes()).containsExactly(
            AFRIKAANS,
            ALBANIAN,
            AMHARIC,
            ARABIC,
            ARMENIAN,
            AZERBAIJANI,
            BASQUE,
            BELARUSIAN,
            BENGALI,
            BOKMAL,
            BOSNIAN,
            BULGARIAN,
            CATALAN,
            CHINESE,
            CROATIAN,
            CZECH,
            DANISH,
            DUTCH,
            ENGLISH,
            ESPERANTO,
            ESTONIAN,
            FINNISH,
            FRENCH,
            GANDA,
            GEORGIAN,
            GERMAN,
            GREEK,
            GUJARATI,
            HEBREW,
            HINDI,
            HUNGARIAN,
            ICELANDIC,
            INDONESIAN,
            IRISH,
            ITALIAN,
            JAPANESE,
            KAZAKH,
            KOREAN,
            LATVIAN,
            LITHUANIAN,
            MACEDONIAN,
            MALAY,
            MAORI,
            MARATHI,
            MONGOLIAN,
            NYNORSK,
            OROMO,
            PERSIAN,
            POLISH,
            PORTUGUESE,
            PUNJABI,
            ROMANIAN,
            RUSSIAN,
            SERBIAN,
            SHONA,
            SINHALA,
            SLOVAK,
            SLOVENE,
            SOMALI,
            SOTHO,
            SPANISH,
            SWAHILI,
            SWEDISH,
            TAGALOG,
            TAMIL,
            TELUGU,
            THAI,
            TIGRINYA,
            TSONGA,
            TSWANA,
            TURKISH,
            UKRAINIAN,
            URDU,
            VIETNAMESE,
            WELSH,
            XHOSA,
            YORUBA,
            ZULU,
        )
    }

    @Test
    fun `assert that certain languages support Arabic script`() {
        assertThat(Language.allWithArabicScript()).containsExactly(ARABIC, PERSIAN, URDU)
    }

    @Test
    fun `assert that certain languages support Cyrillic script`() {
        assertThat(Language.allWithCyrillicScript()).containsExactly(
            BELARUSIAN,
            BULGARIAN,
            KAZAKH,
            MACEDONIAN,
            MONGOLIAN,
            RUSSIAN,
            SERBIAN,
            UKRAINIAN,
        )
    }

    @Test
    fun `assert that certain languages support Devanagari script`() {
        assertThat(Language.allWithDevanagariScript()).containsExactly(HINDI, MARATHI)
    }

    @Test
    fun `assert that certain languages support Ethiopic script`() {
        assertThat(Language.allWithEthiopicScript()).containsExactly(AMHARIC, TIGRINYA)
    }

    @Test
    fun `assert that certain languages support Latin script`() {
        assertThat(Language.allWithLatinScript()).containsExactly(
            AFRIKAANS,
            ALBANIAN,
            AZERBAIJANI,
            BASQUE,
            BOKMAL,
            BOSNIAN,
            CATALAN,
            CROATIAN,
            CZECH,
            DANISH,
            DUTCH,
            ENGLISH,
            ESPERANTO,
            ESTONIAN,
            FINNISH,
            FRENCH,
            GANDA,
            GERMAN,
            HUNGARIAN,
            ICELANDIC,
            INDONESIAN,
            IRISH,
            ITALIAN,
            LATIN,
            LATVIAN,
            LITHUANIAN,
            MALAY,
            MAORI,
            NYNORSK,
            OROMO,
            POLISH,
            PORTUGUESE,
            ROMANIAN,
            SHONA,
            SLOVAK,
            SLOVENE,
            SOMALI,
            SOTHO,
            SPANISH,
            SWAHILI,
            SWEDISH,
            TAGALOG,
            TSONGA,
            TSWANA,
            TURKISH,
            VIETNAMESE,
            WELSH,
            XHOSA,
            YORUBA,
            ZULU,
        )
    }

    @ParameterizedTest
    @MethodSource("filteredLanguagesProvider")
    internal fun `assert that languages support correct alphabets`(
        alphabet: Alphabet,
        expectedLanguages: List<Language>,
    ) {
        assertThat(
            Language.values().filter { it.alphabets.contains(alphabet) },
        ).`as`(
            "alphabet '$alphabet'",
        ).containsExactlyElementsOf(
            expectedLanguages,
        )
    }

    @ParameterizedTest
    @CsvSource(
        "AF, AFRIKAANS",
        "AM, AMHARIC",
        "SQ, ALBANIAN",
        "AR, ARABIC",
        "HY, ARMENIAN",
        "AZ, AZERBAIJANI",
        "EU, BASQUE",
        "BE, BELARUSIAN",
        "BN, BENGALI",
        "NB, BOKMAL",
        "BS, BOSNIAN",
        "BG, BULGARIAN",
        "CA, CATALAN",
        "ZH, CHINESE",
        "HR, CROATIAN",
        "CS, CZECH",
        "DA, DANISH",
        "NL, DUTCH",
        "EN, ENGLISH",
        "EO, ESPERANTO",
        "ET, ESTONIAN",
        "FI, FINNISH",
        "FR, FRENCH",
        "LG, GANDA",
        "KA, GEORGIAN",
        "DE, GERMAN",
        "EL, GREEK",
        "GU, GUJARATI",
        "HE, HEBREW",
        "HI, HINDI",
        "HU, HUNGARIAN",
        "IS, ICELANDIC",
        "ID, INDONESIAN",
        "GA, IRISH",
        "IT, ITALIAN",
        "JA, JAPANESE",
        "KK, KAZAKH",
        "LA, LATIN",
        "LV, LATVIAN",
        "LT, LITHUANIAN",
        "MI, MAORI",
        "MK, MACEDONIAN",
        "MS, MALAY",
        "MR, MARATHI",
        "MN, MONGOLIAN",
        "NN, NYNORSK",
        "OM, OROMO",
        "FA, PERSIAN",
        "PL, POLISH",
        "PT, PORTUGUESE",
        "PA, PUNJABI",
        "RO, ROMANIAN",
        "RU, RUSSIAN",
        "SR, SERBIAN",
        "SN, SHONA",
        "SI, SINHALA",
        "SK, SLOVAK",
        "SL, SLOVENE",
        "SO, SOMALI",
        "ST, SOTHO",
        "ES, SPANISH",
        "SW, SWAHILI",
        "SV, SWEDISH",
        "TL, TAGALOG",
        "TA, TAMIL",
        "TE, TELUGU",
        "TH, THAI",
        "TI, TIGRINYA",
        "TS, TSONGA",
        "TN, TSWANA",
        "TR, TURKISH",
        "UK, UKRAINIAN",
        "UR, URDU",
        "VI, VIETNAMESE",
        "CY, WELSH",
        "XH, XHOSA",
        "YO, YORUBA",
        "ZU, ZULU",
    )
    fun `assert that correct language is returned for iso code`(
        isoCode: IsoCode639_1,
        language: Language,
    ) {
        assertThat(Language.getByIsoCode639_1(isoCode)).isEqualTo(language)
    }

    private fun filteredLanguagesProvider() =
        listOf(
            arguments(Alphabet.ARABIC, listOf(ARABIC, PERSIAN, URDU)),
            arguments(Alphabet.ARMENIAN, listOf(ARMENIAN)),
            arguments(Alphabet.BENGALI, listOf(BENGALI)),
            arguments(
                Alphabet.CYRILLIC,
                listOf(
                    BELARUSIAN,
                    BULGARIAN,
                    KAZAKH,
                    MACEDONIAN,
                    MONGOLIAN,
                    RUSSIAN,
                    SERBIAN,
                    UKRAINIAN,
                ),
            ),
            arguments(Alphabet.DEVANAGARI, listOf(HINDI, MARATHI)),
            arguments(Alphabet.ETHIOPIC, listOf(AMHARIC, TIGRINYA)),
            arguments(Alphabet.GEORGIAN, listOf(GEORGIAN)),
            arguments(Alphabet.GREEK, listOf(GREEK)),
            arguments(Alphabet.GUJARATI, listOf(GUJARATI)),
            arguments(Alphabet.GURMUKHI, listOf(PUNJABI)),
            arguments(Alphabet.HAN, listOf(CHINESE, JAPANESE)),
            arguments(Alphabet.HANGUL, listOf(KOREAN)),
            arguments(Alphabet.HEBREW, listOf(HEBREW)),
            arguments(Alphabet.HIRAGANA, listOf(JAPANESE)),
            arguments(Alphabet.KATAKANA, listOf(JAPANESE)),
            arguments(
                Alphabet.LATIN,
                listOf(
                    AFRIKAANS,
                    ALBANIAN,
                    AZERBAIJANI,
                    BASQUE,
                    BOKMAL,
                    BOSNIAN,
                    CATALAN,
                    CROATIAN,
                    CZECH,
                    DANISH,
                    DUTCH,
                    ENGLISH,
                    ESPERANTO,
                    ESTONIAN,
                    FINNISH,
                    FRENCH,
                    GANDA,
                    GERMAN,
                    HUNGARIAN,
                    ICELANDIC,
                    INDONESIAN,
                    IRISH,
                    ITALIAN,
                    LATIN,
                    LATVIAN,
                    LITHUANIAN,
                    MALAY,
                    MAORI,
                    NYNORSK,
                    OROMO,
                    POLISH,
                    PORTUGUESE,
                    ROMANIAN,
                    SHONA,
                    SLOVAK,
                    SLOVENE,
                    SOMALI,
                    SOTHO,
                    SPANISH,
                    SWAHILI,
                    SWEDISH,
                    TAGALOG,
                    TSONGA,
                    TSWANA,
                    TURKISH,
                    VIETNAMESE,
                    WELSH,
                    XHOSA,
                    YORUBA,
                    ZULU,
                ),
            ),
            arguments(Alphabet.SINHALA, listOf(SINHALA)),
            arguments(Alphabet.TAMIL, listOf(TAMIL)),
            arguments(Alphabet.TELUGU, listOf(TELUGU)),
            arguments(Alphabet.THAI, listOf(THAI)),
            arguments(Alphabet.NONE, listOf(UNKNOWN)),
        )
}
