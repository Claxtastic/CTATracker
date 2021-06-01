package net.thomasclaxton.ctatracker.presentation.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import net.thomasclaxton.ctatracker.constants.ColorConstants.purple200
import net.thomasclaxton.ctatracker.constants.ColorConstants.purple500
import net.thomasclaxton.ctatracker.constants.ColorConstants.purple700
import net.thomasclaxton.ctatracker.constants.ColorConstants.teal200

private val DarkColorPalette = darkColors(
  primary = purple200,
  primaryVariant = purple700,
  secondary = teal200
)

private val LightColorPalette = lightColors(
  primary = purple500,
  primaryVariant = purple700,
  secondary = teal200
)

@Composable
fun CTATheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  var colors = if (darkTheme)
    DarkColorPalette
  else
    LightColorPalette

  MaterialTheme(colors = colors,
    typography = typography,
    shapes = shapes,
    content = content
  )
}
