package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.data.Restaurant
import com.elsawy.task.qurba.ui.theme.Black

@Composable
fun PostOrderInfo(
   restaurant: Restaurant ,
   horizontalMargin: Dp = 16.dp,
   ) {
   Row(modifier = Modifier
      .fillMaxWidth()
      .padding(start = horizontalMargin, top = 12.dp, bottom = 8.dp, end = horizontalMargin)) {
      Image(
         painter = painterResource(restaurant.logo),
         contentDescription = "Contact profile picture",
         contentScale = ContentScale.Crop,
         modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
      )

      Column(Modifier.padding(start = 8.dp)) {
         Text(
            text = restaurant.order,
            fontSize = 14.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.SemiBold,
            color = Black,
         )

         Text(
            text = restaurant.name,
            fontSize = 12.sp,
            color = Black,
            modifier = Modifier.padding(top = 6.dp)
         )
      }
   }
}