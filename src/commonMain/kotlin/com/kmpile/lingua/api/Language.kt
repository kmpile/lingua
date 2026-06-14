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

import com.kmpile.lingua.api.IsoCode639_1.AF
import com.kmpile.lingua.api.IsoCode639_1.AM
import com.kmpile.lingua.api.IsoCode639_1.AR
import com.kmpile.lingua.api.IsoCode639_1.AZ
import com.kmpile.lingua.api.IsoCode639_1.BE
import com.kmpile.lingua.api.IsoCode639_1.BG
import com.kmpile.lingua.api.IsoCode639_1.BN
import com.kmpile.lingua.api.IsoCode639_1.BS
import com.kmpile.lingua.api.IsoCode639_1.CA
import com.kmpile.lingua.api.IsoCode639_1.CS
import com.kmpile.lingua.api.IsoCode639_1.CY
import com.kmpile.lingua.api.IsoCode639_1.DA
import com.kmpile.lingua.api.IsoCode639_1.DE
import com.kmpile.lingua.api.IsoCode639_1.EL
import com.kmpile.lingua.api.IsoCode639_1.EN
import com.kmpile.lingua.api.IsoCode639_1.EO
import com.kmpile.lingua.api.IsoCode639_1.ES
import com.kmpile.lingua.api.IsoCode639_1.ET
import com.kmpile.lingua.api.IsoCode639_1.EU
import com.kmpile.lingua.api.IsoCode639_1.FA
import com.kmpile.lingua.api.IsoCode639_1.FI
import com.kmpile.lingua.api.IsoCode639_1.FR
import com.kmpile.lingua.api.IsoCode639_1.GA
import com.kmpile.lingua.api.IsoCode639_1.GU
import com.kmpile.lingua.api.IsoCode639_1.HE
import com.kmpile.lingua.api.IsoCode639_1.HI
import com.kmpile.lingua.api.IsoCode639_1.HR
import com.kmpile.lingua.api.IsoCode639_1.HU
import com.kmpile.lingua.api.IsoCode639_1.HY
import com.kmpile.lingua.api.IsoCode639_1.ID
import com.kmpile.lingua.api.IsoCode639_1.IS
import com.kmpile.lingua.api.IsoCode639_1.IT
import com.kmpile.lingua.api.IsoCode639_1.JA
import com.kmpile.lingua.api.IsoCode639_1.KA
import com.kmpile.lingua.api.IsoCode639_1.KK
import com.kmpile.lingua.api.IsoCode639_1.KO
import com.kmpile.lingua.api.IsoCode639_1.LA
import com.kmpile.lingua.api.IsoCode639_1.LG
import com.kmpile.lingua.api.IsoCode639_1.LT
import com.kmpile.lingua.api.IsoCode639_1.LV
import com.kmpile.lingua.api.IsoCode639_1.MI
import com.kmpile.lingua.api.IsoCode639_1.MK
import com.kmpile.lingua.api.IsoCode639_1.MN
import com.kmpile.lingua.api.IsoCode639_1.MR
import com.kmpile.lingua.api.IsoCode639_1.MS
import com.kmpile.lingua.api.IsoCode639_1.NB
import com.kmpile.lingua.api.IsoCode639_1.NL
import com.kmpile.lingua.api.IsoCode639_1.NN
import com.kmpile.lingua.api.IsoCode639_1.OM
import com.kmpile.lingua.api.IsoCode639_1.PA
import com.kmpile.lingua.api.IsoCode639_1.PL
import com.kmpile.lingua.api.IsoCode639_1.PT
import com.kmpile.lingua.api.IsoCode639_1.RO
import com.kmpile.lingua.api.IsoCode639_1.RU
import com.kmpile.lingua.api.IsoCode639_1.SI
import com.kmpile.lingua.api.IsoCode639_1.SK
import com.kmpile.lingua.api.IsoCode639_1.SL
import com.kmpile.lingua.api.IsoCode639_1.SN
import com.kmpile.lingua.api.IsoCode639_1.SO
import com.kmpile.lingua.api.IsoCode639_1.SQ
import com.kmpile.lingua.api.IsoCode639_1.SR
import com.kmpile.lingua.api.IsoCode639_1.ST
import com.kmpile.lingua.api.IsoCode639_1.SV
import com.kmpile.lingua.api.IsoCode639_1.SW
import com.kmpile.lingua.api.IsoCode639_1.TA
import com.kmpile.lingua.api.IsoCode639_1.TE
import com.kmpile.lingua.api.IsoCode639_1.TH
import com.kmpile.lingua.api.IsoCode639_1.TI
import com.kmpile.lingua.api.IsoCode639_1.TL
import com.kmpile.lingua.api.IsoCode639_1.TN
import com.kmpile.lingua.api.IsoCode639_1.TR
import com.kmpile.lingua.api.IsoCode639_1.TS
import com.kmpile.lingua.api.IsoCode639_1.UK
import com.kmpile.lingua.api.IsoCode639_1.UR
import com.kmpile.lingua.api.IsoCode639_1.VI
import com.kmpile.lingua.api.IsoCode639_1.XH
import com.kmpile.lingua.api.IsoCode639_1.YO
import com.kmpile.lingua.api.IsoCode639_1.ZH
import com.kmpile.lingua.api.IsoCode639_1.ZU
import com.kmpile.lingua.api.IsoCode639_3.AFR
import com.kmpile.lingua.api.IsoCode639_3.AMH
import com.kmpile.lingua.api.IsoCode639_3.ARA
import com.kmpile.lingua.api.IsoCode639_3.AZE
import com.kmpile.lingua.api.IsoCode639_3.BEL
import com.kmpile.lingua.api.IsoCode639_3.BEN
import com.kmpile.lingua.api.IsoCode639_3.BOS
import com.kmpile.lingua.api.IsoCode639_3.BUL
import com.kmpile.lingua.api.IsoCode639_3.CAT
import com.kmpile.lingua.api.IsoCode639_3.CES
import com.kmpile.lingua.api.IsoCode639_3.CYM
import com.kmpile.lingua.api.IsoCode639_3.DAN
import com.kmpile.lingua.api.IsoCode639_3.DEU
import com.kmpile.lingua.api.IsoCode639_3.ELL
import com.kmpile.lingua.api.IsoCode639_3.ENG
import com.kmpile.lingua.api.IsoCode639_3.EPO
import com.kmpile.lingua.api.IsoCode639_3.EST
import com.kmpile.lingua.api.IsoCode639_3.EUS
import com.kmpile.lingua.api.IsoCode639_3.FAS
import com.kmpile.lingua.api.IsoCode639_3.FIN
import com.kmpile.lingua.api.IsoCode639_3.FRA
import com.kmpile.lingua.api.IsoCode639_3.GLE
import com.kmpile.lingua.api.IsoCode639_3.GUJ
import com.kmpile.lingua.api.IsoCode639_3.HEB
import com.kmpile.lingua.api.IsoCode639_3.HIN
import com.kmpile.lingua.api.IsoCode639_3.HRV
import com.kmpile.lingua.api.IsoCode639_3.HUN
import com.kmpile.lingua.api.IsoCode639_3.HYE
import com.kmpile.lingua.api.IsoCode639_3.IND
import com.kmpile.lingua.api.IsoCode639_3.ISL
import com.kmpile.lingua.api.IsoCode639_3.ITA
import com.kmpile.lingua.api.IsoCode639_3.JPN
import com.kmpile.lingua.api.IsoCode639_3.KAT
import com.kmpile.lingua.api.IsoCode639_3.KAZ
import com.kmpile.lingua.api.IsoCode639_3.KOR
import com.kmpile.lingua.api.IsoCode639_3.LAT
import com.kmpile.lingua.api.IsoCode639_3.LAV
import com.kmpile.lingua.api.IsoCode639_3.LIT
import com.kmpile.lingua.api.IsoCode639_3.LUG
import com.kmpile.lingua.api.IsoCode639_3.MAR
import com.kmpile.lingua.api.IsoCode639_3.MKD
import com.kmpile.lingua.api.IsoCode639_3.MON
import com.kmpile.lingua.api.IsoCode639_3.MRI
import com.kmpile.lingua.api.IsoCode639_3.MSA
import com.kmpile.lingua.api.IsoCode639_3.NLD
import com.kmpile.lingua.api.IsoCode639_3.NNO
import com.kmpile.lingua.api.IsoCode639_3.NOB
import com.kmpile.lingua.api.IsoCode639_3.ORM
import com.kmpile.lingua.api.IsoCode639_3.PAN
import com.kmpile.lingua.api.IsoCode639_3.POL
import com.kmpile.lingua.api.IsoCode639_3.POR
import com.kmpile.lingua.api.IsoCode639_3.RON
import com.kmpile.lingua.api.IsoCode639_3.RUS
import com.kmpile.lingua.api.IsoCode639_3.SIN
import com.kmpile.lingua.api.IsoCode639_3.SLK
import com.kmpile.lingua.api.IsoCode639_3.SLV
import com.kmpile.lingua.api.IsoCode639_3.SNA
import com.kmpile.lingua.api.IsoCode639_3.SOM
import com.kmpile.lingua.api.IsoCode639_3.SOT
import com.kmpile.lingua.api.IsoCode639_3.SPA
import com.kmpile.lingua.api.IsoCode639_3.SQI
import com.kmpile.lingua.api.IsoCode639_3.SRP
import com.kmpile.lingua.api.IsoCode639_3.SWA
import com.kmpile.lingua.api.IsoCode639_3.SWE
import com.kmpile.lingua.api.IsoCode639_3.TAM
import com.kmpile.lingua.api.IsoCode639_3.TEL
import com.kmpile.lingua.api.IsoCode639_3.TGL
import com.kmpile.lingua.api.IsoCode639_3.THA
import com.kmpile.lingua.api.IsoCode639_3.TIR
import com.kmpile.lingua.api.IsoCode639_3.TSN
import com.kmpile.lingua.api.IsoCode639_3.TSO
import com.kmpile.lingua.api.IsoCode639_3.TUR
import com.kmpile.lingua.api.IsoCode639_3.UKR
import com.kmpile.lingua.api.IsoCode639_3.URD
import com.kmpile.lingua.api.IsoCode639_3.VIE
import com.kmpile.lingua.api.IsoCode639_3.XHO
import com.kmpile.lingua.api.IsoCode639_3.YOR
import com.kmpile.lingua.api.IsoCode639_3.ZHO
import com.kmpile.lingua.api.IsoCode639_3.ZUL
import com.kmpile.lingua.internal.Alphabet
import com.kmpile.lingua.internal.Alphabet.CYRILLIC
import com.kmpile.lingua.internal.Alphabet.DEVANAGARI
import com.kmpile.lingua.internal.Alphabet.ETHIOPIC
import com.kmpile.lingua.internal.Alphabet.GURMUKHI
import com.kmpile.lingua.internal.Alphabet.HAN
import com.kmpile.lingua.internal.Alphabet.HANGUL
import com.kmpile.lingua.internal.Alphabet.HIRAGANA
import com.kmpile.lingua.internal.Alphabet.KATAKANA
import com.kmpile.lingua.internal.Alphabet.LATIN
import com.kmpile.lingua.internal.Alphabet.NONE
import com.kmpile.lingua.internal.util.extension.enumSetOf
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * The supported detectable languages.
 */
@Serializable
enum class Language(
    val isoCode639_1: IsoCode639_1,
    val isoCode639_3: IsoCode639_3,
    internal val alphabets: Set<Alphabet>,
    internal val uniqueCharacters: String?,
) {
    AFRIKAANS(AF, AFR, enumSetOf(Alphabet.LATIN), null),
    ALBANIAN(SQ, SQI, enumSetOf(Alphabet.LATIN), null),
    AMHARIC(AM, AMH, enumSetOf(Alphabet.ETHIOPIC), null),
    ARABIC(AR, ARA, enumSetOf(Alphabet.ARABIC), null),
    ARMENIAN(HY, HYE, enumSetOf(Alphabet.ARMENIAN), null),
    AZERBAIJANI(AZ, AZE, enumSetOf(Alphabet.LATIN), "Əə"),
    BASQUE(EU, EUS, enumSetOf(Alphabet.LATIN), null),
    BELARUSIAN(BE, BEL, enumSetOf(CYRILLIC), null),
    BENGALI(BN, BEN, enumSetOf(Alphabet.BENGALI), null),
    BOKMAL(NB, NOB, enumSetOf(Alphabet.LATIN), null),
    BOSNIAN(BS, BOS, enumSetOf(Alphabet.LATIN), null),
    BULGARIAN(BG, BUL, enumSetOf(CYRILLIC), null),
    CATALAN(CA, CAT, enumSetOf(Alphabet.LATIN), "Ïï"),
    CHINESE(ZH, ZHO, enumSetOf(HAN), null),
    CROATIAN(HR, HRV, enumSetOf(Alphabet.LATIN), null),
    CZECH(CS, CES, enumSetOf(Alphabet.LATIN), "ĚěŘřŮů"),
    DANISH(DA, DAN, enumSetOf(Alphabet.LATIN), null),
    DUTCH(NL, NLD, enumSetOf(Alphabet.LATIN), null),
    ENGLISH(EN, ENG, enumSetOf(Alphabet.LATIN), null),
    ESPERANTO(EO, EPO, enumSetOf(Alphabet.LATIN), "ĈĉĜĝĤĥĴĵŜŝŬŭ"),
    ESTONIAN(ET, EST, enumSetOf(Alphabet.LATIN), null),
    FINNISH(FI, FIN, enumSetOf(Alphabet.LATIN), null),
    FRENCH(FR, FRA, enumSetOf(Alphabet.LATIN), null),
    GANDA(LG, LUG, enumSetOf(Alphabet.LATIN), null),
    GEORGIAN(KA, KAT, enumSetOf(Alphabet.GEORGIAN), null),
    GERMAN(DE, DEU, enumSetOf(Alphabet.LATIN), "ß"),
    GREEK(EL, ELL, enumSetOf(Alphabet.GREEK), null),
    GUJARATI(GU, GUJ, enumSetOf(Alphabet.GUJARATI), null),
    HEBREW(HE, HEB, enumSetOf(Alphabet.HEBREW), null),
    HINDI(HI, HIN, enumSetOf(DEVANAGARI), null),
    HUNGARIAN(HU, HUN, enumSetOf(Alphabet.LATIN), "ŐőŰű"),
    ICELANDIC(IS, ISL, enumSetOf(Alphabet.LATIN), null),
    INDONESIAN(ID, IND, enumSetOf(Alphabet.LATIN), null),
    IRISH(GA, GLE, enumSetOf(Alphabet.LATIN), null),
    ITALIAN(IT, ITA, enumSetOf(Alphabet.LATIN), null),
    JAPANESE(JA, JPN, enumSetOf(HIRAGANA, KATAKANA, HAN), null),
    KAZAKH(KK, KAZ, enumSetOf(CYRILLIC), "ӘәҒғҚқҢңҰұ"),
    KOREAN(KO, KOR, enumSetOf(HANGUL), null),
    LATIN(LA, LAT, enumSetOf(Alphabet.LATIN), null),
    LATVIAN(LV, LAV, enumSetOf(Alphabet.LATIN), "ĢģĶķĻļŅņ"),
    LITHUANIAN(LT, LIT, enumSetOf(Alphabet.LATIN), "ĖėĮįŲų"),
    MACEDONIAN(MK, MKD, enumSetOf(CYRILLIC), "ЃѓЅѕЌќЏџ"),
    MALAY(MS, MSA, enumSetOf(Alphabet.LATIN), null),
    MAORI(MI, MRI, enumSetOf(Alphabet.LATIN), null),
    MARATHI(MR, MAR, enumSetOf(DEVANAGARI), "ळ"),
    MONGOLIAN(MN, MON, enumSetOf(CYRILLIC), "ӨөҮү"),
    NYNORSK(NN, NNO, enumSetOf(Alphabet.LATIN), null),
    OROMO(OM, ORM, enumSetOf(Alphabet.LATIN), null),
    PERSIAN(FA, FAS, enumSetOf(Alphabet.ARABIC), null),
    POLISH(PL, POL, enumSetOf(Alphabet.LATIN), "ŁłŃńŚśŹź"),
    PORTUGUESE(PT, POR, enumSetOf(Alphabet.LATIN), null),
    PUNJABI(PA, PAN, enumSetOf(GURMUKHI), null),
    ROMANIAN(RO, RON, enumSetOf(Alphabet.LATIN), "Țţ"),
    RUSSIAN(RU, RUS, enumSetOf(CYRILLIC), null),
    SERBIAN(SR, SRP, enumSetOf(CYRILLIC), "ЂђЋћ"),
    SHONA(SN, SNA, enumSetOf(Alphabet.LATIN), null),
    SINHALA(SI, SIN, enumSetOf(Alphabet.SINHALA), null),
    SLOVAK(SK, SLK, enumSetOf(Alphabet.LATIN), "ĹĺĽľŔŕ"),
    SLOVENE(SL, SLV, enumSetOf(Alphabet.LATIN), null),
    SOMALI(SO, SOM, enumSetOf(Alphabet.LATIN), null),
    SOTHO(ST, SOT, enumSetOf(Alphabet.LATIN), null),
    SPANISH(ES, SPA, enumSetOf(Alphabet.LATIN), "¿¡"),
    SWAHILI(SW, SWA, enumSetOf(Alphabet.LATIN), null),
    SWEDISH(SV, SWE, enumSetOf(Alphabet.LATIN), null),
    TAGALOG(TL, TGL, enumSetOf(Alphabet.LATIN), null),
    TAMIL(TA, TAM, enumSetOf(Alphabet.TAMIL), null),
    TELUGU(TE, TEL, enumSetOf(Alphabet.TELUGU), null),
    THAI(TH, THA, enumSetOf(Alphabet.THAI), null),
    TIGRINYA(TI, TIR, enumSetOf(Alphabet.ETHIOPIC), null),
    TSONGA(TS, TSO, enumSetOf(Alphabet.LATIN), null),
    TSWANA(TN, TSN, enumSetOf(Alphabet.LATIN), null),
    TURKISH(TR, TUR, enumSetOf(Alphabet.LATIN), null),
    UKRAINIAN(UK, UKR, enumSetOf(CYRILLIC), "ҐґЄєЇї"),
    URDU(UR, URD, enumSetOf(Alphabet.ARABIC), null),
    VIETNAMESE(
        VI,
        VIE,
        enumSetOf(Alphabet.LATIN),
        "ẰằẦầẲẳẨẩẴẵẪẫẮắẤấẠạẶặẬậỀềẺẻỂểẼẽỄễẾếỆệỈỉĨĩỊịƠơỒồỜờỎỏỔổỞởỖỗỠỡỐốỚớỘộỢợƯưỪừỦủỬửŨũỮữỨứỤụỰựỲỳỶỷỸỹỴỵ",
    ),
    WELSH(CY, CYM, enumSetOf(Alphabet.LATIN), null),
    XHOSA(XH, XHO, enumSetOf(Alphabet.LATIN), null),

    // TODO for YORUBA: "E̩e̩Ẹ́ẹ́É̩é̩Ẹ̀ẹ̀È̩è̩Ẹ̄ẹ̄Ē̩ē̩ŌōO̩o̩Ọ́ọ́Ó̩ó̩Ọ̀ọ̀Ò̩ò̩Ọ̄ọ̄Ō̩ō̩ṢṣS̩s̩"
    YORUBA(YO, YOR, enumSetOf(Alphabet.LATIN), "Ṣṣ"),
    ZULU(ZU, ZUL, enumSetOf(Alphabet.LATIN), null),

    /**
     * The imaginary unknown language.
     *
     * This value is returned if no language can be detected reliably.
     */
    UNKNOWN(IsoCode639_1.NONE, IsoCode639_3.NONE, enumSetOf(NONE), null),
    ;

    companion object {
        /**
         * Returns a list of all built-in languages.
         */
        @JvmStatic
        fun all(): List<Language> = filterOutLanguages(UNKNOWN)

        /**
         * Returns a list of all built-in languages that are still spoken today.
         */
        @JvmStatic
        fun allSpokenOnes(): List<Language> = filterOutLanguages(UNKNOWN, LATIN)

        /**
         * Returns a list of all built-in languages supporting the Arabic script.
         */
        @JvmStatic
        fun allWithArabicScript(): List<Language> = entries.filter { it.alphabets.contains(Alphabet.ARABIC) }

        /**
         * Returns a list of all built-in languages supporting the Cyrillic script.
         */
        @JvmStatic
        fun allWithCyrillicScript(): List<Language> = entries.filter { it.alphabets.contains(CYRILLIC) }

        /**
         * Returns a list of all built-in languages supporting the Devanagari script.
         */
        @JvmStatic
        fun allWithDevanagariScript(): List<Language> = entries.filter { it.alphabets.contains(DEVANAGARI) }

        /**
         * Returns a list of all built-in languages supporting the Ethiopic script.
         */
        @JvmStatic
        fun allWithEthiopicScript(): List<Language> = entries.filter { it.alphabets.contains(ETHIOPIC) }

        /**
         * Returns a list of all built-in languages supporting the Latin script.
         */
        @JvmStatic
        fun allWithLatinScript(): List<Language> = entries.filter { it.alphabets.contains(Alphabet.LATIN) }

        /**
         * Returns the language for the given ISO 639-1 code.
         */
        @JvmStatic
        @Suppress("ktlint:standard:function-naming")
        fun getByIsoCode639_1(isoCode: IsoCode639_1): Language = entries.first { it.isoCode639_1 == isoCode }

        /**
         * Returns the language for the given ISO 639-3 code.
         */
        @JvmStatic
        @Suppress("ktlint:standard:function-naming")
        fun getByIsoCode639_3(isoCode: IsoCode639_3): Language = entries.first { it.isoCode639_3 == isoCode }

        private fun filterOutLanguages(vararg languages: Language) = entries.filterNot { it in languages }
    }
}
