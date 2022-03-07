package com.elsawy.task.qurba.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import com.elsawy.task.qurba.ui.theme.qurbaTaskColors

val brush = Brush.linearGradient(
   0f to qurbaTaskColors.blue500,
   1f to qurbaTaskColors.purple300,
   start = Offset(0f, .5f)
)

fun Modifier.useBrush(brush: Brush) = this
   .graphicsLayer(alpha = 0.99f)
   .drawWithCache {
      onDrawWithContent {
         drawContent()
         drawRect(brush, blendMode = BlendMode.SrcAtop)
      }
   }