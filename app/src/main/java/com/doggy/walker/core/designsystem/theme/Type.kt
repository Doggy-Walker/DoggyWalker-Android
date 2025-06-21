package com.doggy.walker.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
/*
val PretendardBold = FontFamily(Font(R.font.pretendard_bold, FontWeight.Bold))
val PretendardSemiBold = FontFamily(Font(R.font.pretendard_semibold, FontWeight.SemiBold))
val PretendardMedium = FontFamily(Font(R.font.pretendard_medium, FontWeight.Medium))
val PretendardRegular = FontFamily(Font(R.font.pretendard_regular, FontWeight.Normal))
*/

/*
@Stable
class DoggyWalkerTypography internal constructor(
    title1B17: TextStyle,
    title2Sb15: TextStyle,
    title3B15: TextStyle,
    body1Sb15: TextStyle,
    body2M15: TextStyle,
    body3R15: TextStyle,
    body4B13: TextStyle,
    body5Sb13: TextStyle,
    body6M13: TextStyle,
    body7R13: TextStyle,
    label1B11: TextStyle,
    label2M11: TextStyle,
    label3R11: TextStyle,
    label4M9: TextStyle,
) {
    var title1B17: TextStyle by mutableStateOf(title1B17)
        private set
    var title2Sb15: TextStyle by mutableStateOf(title2Sb15)
        private set
    var title3B15: TextStyle by mutableStateOf(title3B15)
        private set
    var body1Sb15: TextStyle by mutableStateOf(body1Sb15)
        private set
    var body2M15: TextStyle by mutableStateOf(body2M15)
        private set
    var body3R15: TextStyle by mutableStateOf(body3R15)
        private set
    var body4B13: TextStyle by mutableStateOf(body4B13)
        private set
    var body5Sb13: TextStyle by mutableStateOf(body5Sb13)
        private set
    var body6M13: TextStyle by mutableStateOf(body6M13)
        private set
    var body7R13: TextStyle by mutableStateOf(body7R13)
        private set
    var label1B11: TextStyle by mutableStateOf(label1B11)
        private set
    var label2M11: TextStyle by mutableStateOf(label2M11)
        private set
    var label3R11: TextStyle by mutableStateOf(label3R11)
        private set
    var label4M9: TextStyle by mutableStateOf(label4M9)
        private set

    fun copy(
        title1B17: TextStyle = this.title1B17,
        title2Sb15: TextStyle = this.title2Sb15,
        title3B15: TextStyle = this.title3B15,
        body1Sb15: TextStyle = this.body1Sb15,
        body2M15: TextStyle = this.body2M15,
        body3R15: TextStyle = this.body3R15,
        body4B13: TextStyle = this.body4B13,
        body5Sb13: TextStyle = this.body5Sb13,
        body6M13: TextStyle = this.body6M13,
        body7R13: TextStyle = this.body7R13,
        label1B11: TextStyle = this.label1B11,
        label2M11: TextStyle = this.label2M11,
        label3R11: TextStyle = this.label3R11,
        label4M9: TextStyle = this.label4M9
    ): DoggyWalkerTypography = DoggyWalkerTypography(
        title1B17,
        title2Sb15,
        title3B15,
        body1Sb15,
        body2M15,
        body3R15,
        body4B13,
        body5Sb13,
        body6M13,
        body7R13,
        label1B11,
        label2M11,
        label3R11,
        label4M9
    )

    fun update(other: DoggyWalkerTypography) {
        title1B17 = other.title1B17
        title2Sb15 = other.title2Sb15
        title3B15 = other.title3B15
        body1Sb15 = other.body1Sb15
        body2M15 = other.body2M15
        body3R15 = other.body3R15
        body4B13 = other.body4B13
        body5Sb13 = other.body5Sb13
        body6M13 = other.body6M13
        body7R13 = other.body7R13
        label1B11 = other.label1B11
        label2M11 = other.label2M11
        label3R11 = other.label3R11
        label4M9 = other.label4M9
    }
}

fun doggyWalkerTextStyle(
    fontFamily: FontFamily,
    fontWeight: FontWeight,
    fontSize: TextUnit,
    lineHeight: TextUnit,
    letterSpacing: TextUnit
): TextStyle = TextStyle(
    fontFamily = fontFamily,
    fontWeight = fontWeight,
    fontSize = fontSize,
    lineHeight = lineHeight,
    letterSpacing = letterSpacing,
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None
    )
)

@Composable
fun DoggyWalkerTypography(): DoggyWalkerTypography {
    return DoggyWalkerTypography(
        title1B17 = doggyWalkerTextStyle(
            fontFamily = PretendardBold,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            lineHeight = (17 * 1.3).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        title2Sb15 = doggyWalkerTextStyle(
            fontFamily = PretendardSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 17.sp,
            lineHeight = (17 * 1.3).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        title3B15 = doggyWalkerTextStyle(
            fontFamily = PretendardBold,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            lineHeight = (15 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body1Sb15 = doggyWalkerTextStyle(
            fontFamily = PretendardSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            lineHeight = (15 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body2M15 = doggyWalkerTextStyle(
            fontFamily = PretendardSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            lineHeight = (15 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body3R15 = doggyWalkerTextStyle(
            fontFamily = PretendardRegular,
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp,
            lineHeight = (15 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body4B13 = doggyWalkerTextStyle(
            fontFamily = PretendardBold,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            lineHeight = (13 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body5Sb13 = doggyWalkerTextStyle(
            fontFamily = PretendardSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 13.sp,
            lineHeight = (13 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body6M13 = doggyWalkerTextStyle(
            fontFamily = PretendardMedium,
            fontWeight = FontWeight.Medium,
            fontSize = 13.sp,
            lineHeight = (13 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        body7R13 = doggyWalkerTextStyle(
            fontFamily = PretendardRegular,
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp,
            lineHeight = (13 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),

        label1B11 = doggyWalkerTextStyle(
            fontFamily = PretendardBold,
            fontWeight = FontWeight.Bold,
            fontSize = 11.sp,
            lineHeight = (11 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        label2M11 = doggyWalkerTextStyle(
            fontFamily = PretendardMedium,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = (11 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        label3R11 = doggyWalkerTextStyle(
            fontFamily = PretendardRegular,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            lineHeight = (11 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        ),
        label4M9 = doggyWalkerTextStyle(
            fontFamily = PretendardMedium,
            fontWeight = FontWeight.Medium,
            fontSize = 9.sp,
            lineHeight = (9 * 1.4).sp,
            letterSpacing = TextUnit.Unspecified
        )
    )
}

 */