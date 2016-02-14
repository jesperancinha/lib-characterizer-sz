package com.steelzack.chartizate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steelzack.chartizate.distributions.ChartizateDistributionType;

public abstract class  ChartizateFontManager<T> {

	static final String[] unicodeDesignationsJava7 = new String[] { //
			"BASIC_LATIN", //
			"LATIN_1_SUPPLEMENT", //
			"LATIN_EXTENDED_A", //
			"LATIN_EXTENDED_B", //
			"IPA_EXTENSIONS", //
			"SPACING_MODIFIER_LETTERS", //
			"COMBINING_DIACRITICAL_MARKS", //
			"GREEK", //
			"CYRILLIC", //
			"ARMENIAN", //
			"HEBREW", //
			"ARABIC", //
			"DEVANAGARI", //
			"BENGALI", //
			"GURMUKHI", //
			"GUJARATI", //
			"ORIYA", //
			"TAMIL", //
			"TELUGU", //
			"KANNADA", //
			"MALAYALAM", //
			"THAI", //
			"LAO", //
			"TIBETAN", //
			"GEORGIAN", //
			"HANGUL_JAMO", //
			"LATIN_EXTENDED_ADDITIONAL", //
			"GREEK_EXTENDED", //
			"GENERAL_PUNCTUATION", //
			"SUPERSCRIPTS_AND_SUBSCRIPTS", //
			"CURRENCY_SYMBOLS", //
			"COMBINING_MARKS_FOR_SYMBOLS", //
			"LETTERLIKE_SYMBOLS", //
			"NUMBER_FORMS", //
			"ARROWS", //
			"MATHEMATICAL_OPERATORS", //
			"MISCELLANEOUS_TECHNICAL", //
			"CONTROL_PICTURES", //
			"OPTICAL_CHARACTER_RECOGNITION", //
			"ENCLOSED_ALPHANUMERICS", //
			"BOX_DRAWING", //
			"BLOCK_ELEMENTS", //
			"GEOMETRIC_SHAPES", //
			"MISCELLANEOUS_SYMBOLS", //
			"DINGBATS", //
			"CJK_SYMBOLS_AND_PUNCTUATION", //
			"HIRAGANA", //
			"KATAKANA", //
			"BOPOMOFO", //
			"HANGUL_COMPATIBILITY_JAMO", //
			"KANBUN", //
			"ENCLOSED_CJK_LETTERS_AND_MONTHS", //
			"CJK_COMPATIBILITY", //
			"CJK_UNIFIED_IDEOGRAPHS", //
			"HANGUL_SYLLABLES", //
			"PRIVATE_USE_AREA", //
			"CJK_COMPATIBILITY_IDEOGRAPHS", //
			"ALPHABETIC_PRESENTATION_FORMS", //
			"ARABIC_PRESENTATION_FORMS_A", //
			"COMBINING_HALF_MARKS", //
			"CJK_COMPATIBILITY_FORMS", //
			"SMALL_FORM_VARIANTS", //
			"ARABIC_PRESENTATION_FORMS_B", //
			"HALFWIDTH_AND_FULLWIDTH_FORMS", //
			"SPECIALS", //
			"SYRIAC", //
			"THAANA", //
			"SINHALA", //
			"MYANMAR", //
			"ETHIOPIC", //
			"CHEROKEE", //
			"UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS", //
			"OGHAM", //
			"RUNIC", //
			"KHMER", //
			"MONGOLIAN", //
			"BRAILLE_PATTERNS", //
			"CJK_RADICALS_SUPPLEMENT", //
			"KANGXI_RADICALS", //
			"IDEOGRAPHIC_DESCRIPTION_CHARACTERS", //
			"BOPOMOFO_EXTENDED", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A", //
			"YI_SYLLABLES", //
			"YI_RADICALS", //
			"CYRILLIC_SUPPLEMENTARY", //
			"TAGALOG", //
			"HANUNOO", //
			"BUHID", //
			"TAGBANWA", //
			"LIMBU", //
			"TAI_LE", //
			"KHMER_SYMBOLS", //
			"PHONETIC_EXTENSIONS", //
			"MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A", //
			"SUPPLEMENTAL_ARROWS_A", //
			"SUPPLEMENTAL_ARROWS_B", //
			"MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B", //
			"SUPPLEMENTAL_MATHEMATICAL_OPERATORS", //
			"MISCELLANEOUS_SYMBOLS_AND_ARROWS", //
			"KATAKANA_PHONETIC_EXTENSIONS", //
			"YIJING_HEXAGRAM_SYMBOLS", //
			"VARIATION_SELECTORS", //
			"LINEAR_B_SYLLABARY", //
			"LINEAR_B_IDEOGRAMS", //
			"AEGEAN_NUMBERS", //
			"OLD_ITALIC", //
			"GOTHIC", //
			"UGARITIC", //
			"DESERET", //
			"SHAVIAN", //
			"OSMANYA", //
			"CYPRIOT_SYLLABARY", //
			"BYZANTINE_MUSICAL_SYMBOLS", //
			"MUSICAL_SYMBOLS", //
			"TAI_XUAN_JING_SYMBOLS", //
			"MATHEMATICAL_ALPHANUMERIC_SYMBOLS", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B", //
			"CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT", //
			"TAGS", //
			"VARIATION_SELECTORS_SUPPLEMENT", //
			"SUPPLEMENTARY_PRIVATE_USE_AREA_A", //
			"SUPPLEMENTARY_PRIVATE_USE_AREA_B", //
			"HIGH_SURROGATES", //
			"HIGH_PRIVATE_USE_SURROGATES", //
			"LOW_SURROGATES", //
			"ARABIC_SUPPLEMENT", //
			"NKO", //
			"SAMARITAN", //
			"MANDAIC", //
			"ETHIOPIC_SUPPLEMENT", //
			"UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED", //
			"NEW_TAI_LUE", //
			"BUGINESE", //
			"TAI_THAM", //
			"BALINESE", //
			"SUNDANESE", //
			"BATAK", //
			"LEPCHA", //
			"OL_CHIKI", //
			"VEDIC_EXTENSIONS", //
			"PHONETIC_EXTENSIONS_SUPPLEMENT", //
			"COMBINING_DIACRITICAL_MARKS_SUPPLEMENT", //
			"GLAGOLITIC", //
			"LATIN_EXTENDED_C", //
			"COPTIC", //
			"GEORGIAN_SUPPLEMENT", //
			"TIFINAGH", //
			"ETHIOPIC_EXTENDED", //
			"CYRILLIC_EXTENDED_A", //
			"SUPPLEMENTAL_PUNCTUATION", //
			"CJK_STROKES", //
			"LISU", //
			"VAI", //
			"CYRILLIC_EXTENDED_B", //
			"BAMUM", //
			"MODIFIER_TONE_LETTERS", //
			"LATIN_EXTENDED_D", //
			"SYLOTI_NAGRI", //
			"COMMON_INDIC_NUMBER_FORMS", //
			"PHAGS_PA", //
			"SAURASHTRA", //
			"DEVANAGARI_EXTENDED", //
			"KAYAH_LI", //
			"REJANG", //
			"HANGUL_JAMO_EXTENDED_A", //
			"JAVANESE", //
			"CHAM", //
			"MYANMAR_EXTENDED_A", //
			"TAI_VIET", //
			"ETHIOPIC_EXTENDED_A", //
			"MEETEI_MAYEK", //
			"HANGUL_JAMO_EXTENDED_B", //
			"VERTICAL_FORMS", //
			"ANCIENT_GREEK_NUMBERS", //
			"ANCIENT_SYMBOLS", //
			"PHAISTOS_DISC", //
			"LYCIAN", //
			"CARIAN", //
			"OLD_PERSIAN", //
			"IMPERIAL_ARAMAIC", //
			"PHOENICIAN", //
			"LYDIAN", //
			"KHAROSHTHI", //
			"OLD_SOUTH_ARABIAN", //
			"AVESTAN", //
			"INSCRIPTIONAL_PARTHIAN", //
			"INSCRIPTIONAL_PAHLAVI", //
			"OLD_TURKIC", //
			"RUMI_NUMERAL_SYMBOLS", //
			"BRAHMI", //
			"KAITHI", //
			"CUNEIFORM", //
			"CUNEIFORM_NUMBERS_AND_PUNCTUATION", //
			"EGYPTIAN_HIEROGLYPHS", //
			"BAMUM_SUPPLEMENT", //
			"KANA_SUPPLEMENT", //
			"ANCIENT_GREEK_MUSICAL_NOTATION", //
			"COUNTING_ROD_NUMERALS", //
			"MAHJONG_TILES", //
			"DOMINO_TILES", //
			"PLAYING_CARDS", //
			"ENCLOSED_ALPHANUMERIC_SUPPLEMENT", //
			"ENCLOSED_IDEOGRAPHIC_SUPPLEMENT", //
			"MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS", //
			"EMOTICONS", //
			"TRANSPORT_AND_MAP_SYMBOLS", //
			"ALCHEMICAL_SYMBOLS", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D", //
	};
	

	public static List<String> getAllUniCodeBlockStringsJava7() {
		return Arrays.asList(unicodeDesignationsJava7);
	}

	public static List<String> getAllDistributionTypes() {
		final List<String> distributionTypes = new ArrayList<>();

		for (ChartizateDistributionType type : Arrays.asList(ChartizateDistributionType.values())) {
			distributionTypes.add(type.toString());
		}
		return distributionTypes;
	}
	/**
	 * Gets the width of a particular character
	 * 
	 * @param c
	 *            Character
	 * @return Width of character
	 */
	abstract int getCharacterWidth(char c);

	/**
	 * Gets full height of a particular character
	 * 
	 * @param c
	 *            Character
	 * @return Width of character
	 */
	abstract int getCharacterHeight(char c);

	abstract T getFont();
	
	abstract int getFontSize();	
}