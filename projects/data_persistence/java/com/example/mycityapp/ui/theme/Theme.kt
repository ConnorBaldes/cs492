package com.example.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable


private val LightColors = lightColorScheme(
    primary = myLightPrimary,
    onPrimary = myLightOnPrimary,
    primaryContainer = myLightPrimaryContainer,
    onPrimaryContainer = myLightOnPrimaryContainer,
    secondary = myLightSecondary,
    onSecondary = myLightOnSecondary,
    secondaryContainer = myLightSecondaryContainer,
    onSecondaryContainer = myLightOnSecondaryContainer,
    tertiary = myLightTertiary,
    onTertiary = myLightOnTertiary,
    tertiaryContainer = myLightTertiaryContainer,
    onTertiaryContainer = myLightOnTertiaryContainer,
    error = myLightError,
    errorContainer = myLightErrorContainer,
    onError = myLightOnError,
    onErrorContainer = myLightOnErrorContainer,
    background = myLightBackground,
    onBackground = myLightOnBackground,
    surface = myLightSurface,
    onSurface = myLightOnSurface,
    surfaceVariant = myLightSurfaceVariant,
    onSurfaceVariant = myLightOnSurfaceVariant,
    outline = myLightOutline,
    inverseOnSurface = myLightInverseOnSurface,
    inverseSurface = myLightInverseSurface,
    inversePrimary = myLightInversePrimary,
    surfaceTint = myLightSurfaceTint,
    outlineVariant = myLightOutlineVariant,
    scrim = myLightScrim,
)

private val DarkColors = darkColorScheme(
    primary = myDarkPrimary,
    onPrimary = myDarkOnPrimary,
    primaryContainer = myDarkPrimaryContainer,
    onPrimaryContainer = myDarkOnPrimaryContainer,
    secondary = myDarkSecondary,
    onSecondary = myDarkOnSecondary,
    secondaryContainer = myDarkSecondaryContainer,
    onSecondaryContainer = myDarkOnSecondaryContainer,
    tertiary = myDarkTertiary,
    onTertiary = myDarkOnTertiary,
    tertiaryContainer = myDarkTertiaryContainer,
    onTertiaryContainer = myDarkOnTertiaryContainer,
    error = myDarkError,
    errorContainer = myDarkErrorContainer,
    onError = myDarkOnError,
    onErrorContainer = myDarkOnErrorContainer,
    background = myDarkBackground,
    onBackground = myDarkOnBackground,
    surface = myDarkSurface,
    onSurface = myDarkOnSurface,
    surfaceVariant = myDarkSurfaceVariant,
    onSurfaceVariant = myDarkOnSurfaceVariant,
    outline = myDarkOutline,
    inverseOnSurface = myDarkInverseOnSurface,
    inverseSurface = myDarkInverseSurface,
    inversePrimary = myDarkInversePrimary,
    surfaceTint = myDarkSurfaceTint,
    outlineVariant = myDarkOutlineVariant,
    scrim = myDarkScrim,
)


@Composable
fun MyCityAppTheme(
    useDarkTheme: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colors = if (!useDarkTheme) {
        LightColors
    } else {
        DarkColors
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}