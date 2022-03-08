package com.elsawy.task.qurba.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.ui.theme.Black

@Composable
fun PostCaption(caption: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet") {
   Text(
      text = caption,
      fontSize = 12.sp,
      style = MaterialTheme.typography.body1,
      color = Black,
      modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
   )
}
