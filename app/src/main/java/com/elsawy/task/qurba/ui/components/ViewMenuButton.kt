package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ViewMenuButton(modifier: Modifier = Modifier.fillMaxWidth()) {

   Box(modifier = Modifier.padding(bottom = 7.5.dp)) {
      Button(
         modifier = modifier
            .padding(start = 16.dp, end = 16.dp)
            .clip(RoundedCornerShape(20.dp)),
         contentPadding = PaddingValues(),
         onClick = { },
      ) {
         Box(
            modifier = Modifier
               .background(buttonBrush)
               .then(modifier)
               .padding(4.dp),
            contentAlignment = Alignment.Center,
         ) {
            Text(
               text = "View Menu",
               fontSize = 12.sp,
               fontWeight = FontWeight.Medium,
               color = Color(0xFF8A50DE),
               modifier = Modifier.padding(top = 7.5.dp, bottom = 7.5.dp)
            )
         }
      }
   }
}
