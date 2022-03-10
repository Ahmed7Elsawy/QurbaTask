package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SmallDivider() {
   Divider(
      color = Color(0xFF979797).copy(.5f),
      modifier = Modifier
         .fillMaxWidth()
         .padding(horizontal = 16.dp)
         .height(1.dp)
   )
}

@Composable
fun BigDivider() {
   Divider(
      color = Color(0xFFE0E0E0).copy(.5f),
      modifier = Modifier
         .fillMaxWidth()
         .height(3.dp)
   )
}
