package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.ui.theme.Black

@Composable
fun PostCaption(
   caption: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
   horizontalMargin: Dp = 16.dp,
) {
   Text(
      text = caption,
      fontSize = 12.sp,
      style = MaterialTheme.typography.body1,
      color = Black,
      modifier = Modifier.padding(horizontal = horizontalMargin, vertical = 8.dp)
   )
}
