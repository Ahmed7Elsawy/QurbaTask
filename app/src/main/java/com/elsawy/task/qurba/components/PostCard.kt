package com.elsawy.task.qurba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.ui.theme.Black
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme

@Composable
fun PostCard() {
   Column(modifier = Modifier.fillMaxWidth()) {
      PostHeader()
   }
}



@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
   QurbaTaskTheme {
      PostCard()
   }
}