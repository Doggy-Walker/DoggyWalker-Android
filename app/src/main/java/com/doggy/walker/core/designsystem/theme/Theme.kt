package com.doggy.walker.core.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

/*private val localDoggyWalkerColors = staticCompositionLocalOf<DoggyWalkerColors> {
    error("No DoggyWalkerColors provided")
}

private val localDoggyWalkerTypography = staticCompositionLocalOf<DoggyWalkerTypography> {
    error("No DoggyWalkerTypography provided")
}

object DoggyWalkerTheme {
    val colors: DoggyWalkerColors
        @Composable
        @ReadOnlyComposable
        get() = localDoggyWalkerColors.current

    val typography: DoggyWalkerTypography
        @Composable
        @ReadOnlyComposable
        get() = localDoggyWalkerTypography.current
}

@Composable
fun ProvideDoggyWalkerColorsAndTypography(
    colors: DoggyWalkerColors,
    typography: DoggyWalkerTypography,
    content: @Composable () -> Unit
) {
    val provideColors = remember { colors.copy() }
    provideColors.update(colors)

    val provideTypography = remember { typography.copy() }
    provideTypography.update(typography)

    CompositionLocalProvider(
        localDoggyWalkerColors provides provideColors,
        localDoggyWalkerTypography provides provideTypography,
        content = content
    )
}*/
/*
@Composable
fun DoggyWalkerAndroidTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = DoggyWalkerColors()
    val typography = DoggyWalkerTypography()

    ProvideDoggyWalkerColorsAndTypography(colors, typography) {
        MaterialTheme(content = content)
    }
}*/

@Composable
fun DoggyWalkerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}