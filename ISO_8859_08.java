
package com.aaa.research;

import java.util.EnumSet;

public enum ISO_8859_08 {

    NULL(0, 0),
    START_OF_HEADING(1, 1),
    START_OF_TEXT(2, 2),
    END_OF_TEXT(3, 3),
    END_OF_TRANSMISSION(4, 4),
    ENQUIRY(5, 5),
    ACKNOWLEDGE(6, 6),
    BELL(7, 7),
    BACKSPACE(8, 8),
    HORIZONTAL_TABULATION(9, 9),
    LINE_FEED(10, 10),
    VERTICAL_TABULATION(11, 11),
    FORM_FEED(12, 12),
    CARRIAGE_RETURN(13, 13),
    SHIFT_OUT(14, 14),
    SHIFT_IN(15, 15),
    DATA_LINK_ESCAPE(16, 16),
    DEVICE_CONTROL_ONE(17, 17),
    DEVICE_CONTROL_TWO(18, 18),
    DEVICE_CONTROL_THREE(19, 19),
    DEVICE_CONTROL_FOUR(20, 20),
    NEGATIVE_ACKNOWLEDGE(21, 21),
    SYNCHRONOUS_IDLE(22, 22),
    END_OF_TRANSMISSION_BLOCK(23, 23),
    CANCEL(24, 24),
    END_OF_MEDIUM(25, 25),
    SUBSTITUTE(26, 26),
    ESCAPE(27, 27),
    FILE_SEPARATOR(28, 28),
    GROUP_SEPARATOR(29, 29),
    RECORD_SEPARATOR(30, 30),
    UNIT_SEPARATOR(31, 31),
    SPACE(32, 32),
    EXCLAMATION_MARK(33, 33),
    QUOTATION_MARK(34, 34),
    NUMBER_SIGN(35, 35),
    DOLLAR_SIGN(36, 36),
    PERCENT_SIGN(37, 37),
    AMPERSAND(38, 38),
    APOSTROPHE(39, 39),
    LEFT_PARENTHESIS(40, 40),
    RIGHT_PARENTHESIS(41, 41),
    ASTERISK(42, 42),
    PLUS_SIGN(43, 43),
    COMMA(44, 44),
    HYPHEN_MINUS(45, 45),
    FULL_STOP(46, 46),
    SOLIDUS(47, 47),
    DIGIT_ZERO(48, 48),
    DIGIT_ONE(49, 49),
    DIGIT_TWO(50, 50),
    DIGIT_THREE(51, 51),
    DIGIT_FOUR(52, 52),
    DIGIT_FIVE(53, 53),
    DIGIT_SIX(54, 54),
    DIGIT_SEVEN(55, 55),
    DIGIT_EIGHT(56, 56),
    DIGIT_NINE(57, 57),
    COLON(58, 58),
    SEMICOLON(59, 59),
    LESS_THAN_SIGN(60, 60),
    EQUALS_SIGN(61, 61),
    GREATER_THAN_SIGN(62, 62),
    QUESTION_MARK(63, 63),
    COMMERCIAL_AT(64, 64),
    LATIN_CAPITAL_LETTER_A(65, 65),
    LATIN_CAPITAL_LETTER_B(66, 66),
    LATIN_CAPITAL_LETTER_C(67, 67),
    LATIN_CAPITAL_LETTER_D(68, 68),
    LATIN_CAPITAL_LETTER_E(69, 69),
    LATIN_CAPITAL_LETTER_F(70, 70),
    LATIN_CAPITAL_LETTER_G(71, 71),
    LATIN_CAPITAL_LETTER_H(72, 72),
    LATIN_CAPITAL_LETTER_I(73, 73),
    LATIN_CAPITAL_LETTER_J(74, 74),
    LATIN_CAPITAL_LETTER_K(75, 75),
    LATIN_CAPITAL_LETTER_L(76, 76),
    LATIN_CAPITAL_LETTER_M(77, 77),
    LATIN_CAPITAL_LETTER_N(78, 78),
    LATIN_CAPITAL_LETTER_O(79, 79),
    LATIN_CAPITAL_LETTER_P(80, 80),
    LATIN_CAPITAL_LETTER_Q(81, 81),
    LATIN_CAPITAL_LETTER_R(82, 82),
    LATIN_CAPITAL_LETTER_S(83, 83),
    LATIN_CAPITAL_LETTER_T(84, 84),
    LATIN_CAPITAL_LETTER_U(85, 85),
    LATIN_CAPITAL_LETTER_V(86, 86),
    LATIN_CAPITAL_LETTER_W(87, 87),
    LATIN_CAPITAL_LETTER_X(88, 88),
    LATIN_CAPITAL_LETTER_Y(89, 89),
    LATIN_CAPITAL_LETTER_Z(90, 90),
    LEFT_SQUARE_BRACKET(91, 91),
    REVERSE_SOLIDUS(92, 92),
    RIGHT_SQUARE_BRACKET(93, 93),
    CIRCUMFLEX_ACCENT(94, 94),
    LOW_LINE(95, 95),
    GRAVE_ACCENT(96, 96),
    LATIN_SMALL_LETTER_A(97, 97),
    LATIN_SMALL_LETTER_B(98, 98),
    LATIN_SMALL_LETTER_C(99, 99),
    LATIN_SMALL_LETTER_D(100, 100),
    LATIN_SMALL_LETTER_E(101, 101),
    LATIN_SMALL_LETTER_F(102, 102),
    LATIN_SMALL_LETTER_G(103, 103),
    LATIN_SMALL_LETTER_H(104, 104),
    LATIN_SMALL_LETTER_I(105, 105),
    LATIN_SMALL_LETTER_J(106, 106),
    LATIN_SMALL_LETTER_K(107, 107),
    LATIN_SMALL_LETTER_L(108, 108),
    LATIN_SMALL_LETTER_M(109, 109),
    LATIN_SMALL_LETTER_N(110, 110),
    LATIN_SMALL_LETTER_O(111, 111),
    LATIN_SMALL_LETTER_P(112, 112),
    LATIN_SMALL_LETTER_Q(113, 113),
    LATIN_SMALL_LETTER_R(114, 114),
    LATIN_SMALL_LETTER_S(115, 115),
    LATIN_SMALL_LETTER_T(116, 116),
    LATIN_SMALL_LETTER_U(117, 117),
    LATIN_SMALL_LETTER_V(118, 118),
    LATIN_SMALL_LETTER_W(119, 119),
    LATIN_SMALL_LETTER_X(120, 120),
    LATIN_SMALL_LETTER_Y(121, 121),
    LATIN_SMALL_LETTER_Z(122, 122),
    LEFT_CURLY_BRACKET(123, 123),
    VERTICAL_LINE(124, 124),
    RIGHT_CURLY_BRACKET(125, 125),
    TILDE(126, 126),
    DELETE(127, 127),
    CONTROL_1(128, 128),
    CONTROL_2(129, 129),
    CONTROL_3(130, 130),
    CONTROL_4(131, 131),
    CONTROL_5(132, 132),
    CONTROL_6(133, 133),
    CONTROL_7(134, 134),
    CONTROL_8(135, 135),
    CONTROL_9(136, 136),
    CONTROL_10(137, 137),
    CONTROL_11(138, 138),
    CONTROL_12(139, 139),
    CONTROL_13(140, 140),
    CONTROL_14(141, 141),
    CONTROL_15(142, 142),
    CONTROL_16(143, 143),
    CONTROL_17(144, 144),
    CONTROL_18(145, 145),
    CONTROL_19(146, 146),
    CONTROL_20(147, 147),
    CONTROL_21(148, 148),
    CONTROL_22(149, 149),
    CONTROL_23(150, 150),
    CONTROL_24(151, 151),
    CONTROL_25(152, 152),
    CONTROL_26(153, 153),
    CONTROL_27(154, 154),
    CONTROL_28(155, 155),
    CONTROL_29(156, 156),
    CONTROL_30(157, 157),
    CONTROL_31(158, 158),
    CONTROL_32(159, 159),
    NO_BREAK_SPACE(160, 160),
    CENT_SIGN(162, 162),
    POUND_SIGN(163, 163),
    CURRENCY_SIGN(164, 164),
    YEN_SIGN(165, 165),
    BROKEN_BAR(166, 166),
    SECTION_SIGN(167, 167),
    DIAERESIS(168, 168),
    COPYRIGHT_SIGN(169, 169),
    MULTIPLICATION_SIGN(170, 215),
    LEFT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK(171, 171),
    NOT_SIGN(172, 172),
    SOFT_HYPHEN(173, 173),
    REGISTERED_SIGN(174, 174),
    MACRON(175, 175),
    DEGREE_SIGN(176, 176),
    PLUS_MINUS_SIGN(177, 177),
    SUPERSCRIPT_TWO(178, 178),
    SUPERSCRIPT_THREE(179, 179),
    ACUTE_ACCENT(180, 180),
    MICRO_SIGN(181, 181),
    PILCROW_SIGN(182, 182),
    MIDDLE_DOT(183, 183),
    CEDILLA(184, 184),
    SUPERSCRIPT_ONE(185, 185),
    DIVISION_SIGN(186, 247),
    RIGHT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK(187, 187),
    VULGAR_FRACTION_ONE_QUARTER(188, 188),
    VULGAR_FRACTION_ONE_HALF(189, 189),
    VULGAR_FRACTION_THREE_QUARTERS(190, 190),
    DOUBLE_LOW_LINE(223, 8215),
    HEBREW_LETTER_ALEF(224, 1488),
    HEBREW_LETTER_BET(225, 1489),
    HEBREW_LETTER_GIMEL(226, 1490),
    HEBREW_LETTER_DALET(227, 1491),
    HEBREW_LETTER_HE(228, 1492),
    HEBREW_LETTER_VAV(229, 1493),
    HEBREW_LETTER_ZAYIN(230, 1494),
    HEBREW_LETTER_HET(231, 1495),
    HEBREW_LETTER_TET(232, 1496),
    HEBREW_LETTER_YOD(233, 1497),
    HEBREW_LETTER_FINAL_KAF(234, 1498),
    HEBREW_LETTER_KAF(235, 1499),
    HEBREW_LETTER_LAMED(236, 1500),
    HEBREW_LETTER_FINAL_MEM(237, 1501),
    HEBREW_LETTER_MEM(238, 1502),
    HEBREW_LETTER_FINAL_NUN(239, 1503),
    HEBREW_LETTER_NUN(240, 1504),
    HEBREW_LETTER_SAMEKH(241, 1505),
    HEBREW_LETTER_AYIN(242, 1506),
    HEBREW_LETTER_FINAL_PE(243, 1507),
    HEBREW_LETTER_PE(244, 1508),
    HEBREW_LETTER_FINAL_TSADI(245, 1509),
    HEBREW_LETTER_TSADI(246, 1510),
    HEBREW_LETTER_QOF(247, 1511),
    HEBREW_LETTER_RESH(248, 1512),
    HEBREW_LETTER_SHIN(249, 1513),
    HEBREW_LETTER_TAV(250, 1514),
    LEFT_TO_RIGHT_MARK(253, 8206),
    RIGHT_TO_LEFT_MARK(254, 8207);
    private final int iso_iec_8859_code;
    private final int unicode;
    public final static EnumSet<ISO_8859_08> CAPITAL_LETTERS = EnumSet.of(ISO_8859_08 .LATIN_CAPITAL_LETTER_A, ISO_8859_08 .LATIN_CAPITAL_LETTER_B, ISO_8859_08 .LATIN_CAPITAL_LETTER_C, ISO_8859_08 .LATIN_CAPITAL_LETTER_D, ISO_8859_08 .LATIN_CAPITAL_LETTER_E, ISO_8859_08 .LATIN_CAPITAL_LETTER_F, ISO_8859_08 .LATIN_CAPITAL_LETTER_G, ISO_8859_08 .LATIN_CAPITAL_LETTER_H, ISO_8859_08 .LATIN_CAPITAL_LETTER_I, ISO_8859_08 .LATIN_CAPITAL_LETTER_J, ISO_8859_08 .LATIN_CAPITAL_LETTER_K, ISO_8859_08 .LATIN_CAPITAL_LETTER_L, ISO_8859_08 .LATIN_CAPITAL_LETTER_M, ISO_8859_08 .LATIN_CAPITAL_LETTER_N, ISO_8859_08 .LATIN_CAPITAL_LETTER_O, ISO_8859_08 .LATIN_CAPITAL_LETTER_P, ISO_8859_08 .LATIN_CAPITAL_LETTER_Q, ISO_8859_08 .LATIN_CAPITAL_LETTER_R, ISO_8859_08 .LATIN_CAPITAL_LETTER_S, ISO_8859_08 .LATIN_CAPITAL_LETTER_T, ISO_8859_08 .LATIN_CAPITAL_LETTER_U, ISO_8859_08 .LATIN_CAPITAL_LETTER_V, ISO_8859_08 .LATIN_CAPITAL_LETTER_W, ISO_8859_08 .LATIN_CAPITAL_LETTER_X, ISO_8859_08 .LATIN_CAPITAL_LETTER_Y, ISO_8859_08 .LATIN_CAPITAL_LETTER_Z);
    public final static EnumSet<ISO_8859_08> SMALL_LETTERS = EnumSet.of(ISO_8859_08 .LATIN_SMALL_LETTER_A, ISO_8859_08 .LATIN_SMALL_LETTER_B, ISO_8859_08 .LATIN_SMALL_LETTER_C, ISO_8859_08 .LATIN_SMALL_LETTER_D, ISO_8859_08 .LATIN_SMALL_LETTER_E, ISO_8859_08 .LATIN_SMALL_LETTER_F, ISO_8859_08 .LATIN_SMALL_LETTER_G, ISO_8859_08 .LATIN_SMALL_LETTER_H, ISO_8859_08 .LATIN_SMALL_LETTER_I, ISO_8859_08 .LATIN_SMALL_LETTER_J, ISO_8859_08 .LATIN_SMALL_LETTER_K, ISO_8859_08 .LATIN_SMALL_LETTER_L, ISO_8859_08 .LATIN_SMALL_LETTER_M, ISO_8859_08 .LATIN_SMALL_LETTER_N, ISO_8859_08 .LATIN_SMALL_LETTER_O, ISO_8859_08 .LATIN_SMALL_LETTER_P, ISO_8859_08 .LATIN_SMALL_LETTER_Q, ISO_8859_08 .LATIN_SMALL_LETTER_R, ISO_8859_08 .LATIN_SMALL_LETTER_S, ISO_8859_08 .LATIN_SMALL_LETTER_T, ISO_8859_08 .LATIN_SMALL_LETTER_U, ISO_8859_08 .LATIN_SMALL_LETTER_V, ISO_8859_08 .LATIN_SMALL_LETTER_W, ISO_8859_08 .LATIN_SMALL_LETTER_X, ISO_8859_08 .LATIN_SMALL_LETTER_Y, ISO_8859_08 .LATIN_SMALL_LETTER_Z);
    public final static EnumSet<ISO_8859_08> INTERNATIONAL_LETTERS = EnumSet.of(ISO_8859_08 .HEBREW_LETTER_ALEF, ISO_8859_08 .HEBREW_LETTER_BET, ISO_8859_08 .HEBREW_LETTER_GIMEL, ISO_8859_08 .HEBREW_LETTER_DALET, ISO_8859_08 .HEBREW_LETTER_HE, ISO_8859_08 .HEBREW_LETTER_VAV, ISO_8859_08 .HEBREW_LETTER_ZAYIN, ISO_8859_08 .HEBREW_LETTER_HET, ISO_8859_08 .HEBREW_LETTER_TET, ISO_8859_08 .HEBREW_LETTER_YOD, ISO_8859_08 .HEBREW_LETTER_FINAL_KAF, ISO_8859_08 .HEBREW_LETTER_KAF, ISO_8859_08 .HEBREW_LETTER_LAMED, ISO_8859_08 .HEBREW_LETTER_FINAL_MEM, ISO_8859_08 .HEBREW_LETTER_MEM, ISO_8859_08 .HEBREW_LETTER_FINAL_NUN, ISO_8859_08 .HEBREW_LETTER_NUN, ISO_8859_08 .HEBREW_LETTER_SAMEKH, ISO_8859_08 .HEBREW_LETTER_AYIN, ISO_8859_08 .HEBREW_LETTER_FINAL_PE, ISO_8859_08 .HEBREW_LETTER_PE, ISO_8859_08 .HEBREW_LETTER_FINAL_TSADI, ISO_8859_08 .HEBREW_LETTER_TSADI, ISO_8859_08 .HEBREW_LETTER_QOF, ISO_8859_08 .HEBREW_LETTER_RESH, ISO_8859_08 .HEBREW_LETTER_SHIN, ISO_8859_08 .HEBREW_LETTER_TAV);

    private ISO_8859_08(int iso_iec_8859_code, int unicode) {
        this.iso_iec_8859_code = iso_iec_8859_code;
        this.unicode = unicode;
    }

    public char get_iso_iec_8859_code() {
        return ((char) iso_iec_8859_code);
    }

    public char get_unicode() {
        return ((char) unicode);
    }

}