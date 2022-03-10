package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.data.Comment
import com.elsawy.task.qurba.ui.theme.Black

@Composable
fun CommentCard(comment: Comment) {
   Row(modifier = Modifier
      .fillMaxWidth()
      .padding(start = 16.dp, top = 12.dp, bottom = 12.dp, end = 16.dp)) {

      Image(
         painter = painterResource(comment.user.imageId),
         contentDescription = "profile picture",
         contentScale = ContentScale.Crop,
         modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
      )
      Column(modifier = Modifier
         .fillMaxWidth()
         .padding(start = 8.dp)) {

         Column(Modifier
            .clip(RoundedCornerShape(13.dp))
            .background(Color(0x80EFF2F5))
            .padding(start = 12.dp, top = 8.dp, bottom = 8.dp, end = 18.dp)) {
            Text(
               text = comment.user.name,
               fontSize = 12.sp,
               fontWeight = FontWeight.SemiBold,
               color = Black,
            )

            Text(
               text = comment.body,
               fontSize = 12.sp,
               color = Black,
            )
         }

         CommentReactions(comment.time, comment.likesCount)
      }
   }
}

@Composable
private fun CommentReactions(time: String, likesCount: String) {
   Row(modifier = Modifier.padding(top = 2.dp, start = 8.dp)) {
      Text(
         text = time,
         fontSize = 12.sp,
         color = Black,
         modifier = Modifier.padding(end = 16.dp)
      )
      Text(
         text = "Like",
         fontSize = 12.sp,
         fontWeight = FontWeight.Medium,
         color = Black,
         modifier = Modifier.padding(end = 16.dp)
      )
      Text(
         text = "Reply",
         fontSize = 12.sp,
         fontWeight = FontWeight.Medium,
         color = Black,
         modifier = Modifier.padding(end = 16.dp)
      )
      Text(
         text = likesCount,
         fontSize = 12.sp,
         fontWeight = FontWeight.Medium,
         color = Black,
         modifier = Modifier.padding(end = 4.dp)
      )
      Icon(painter = painterResource(R.drawable.ic_likes_count),
         contentDescription = "like",
         modifier = Modifier
            .size(16.dp)
            .clip(CircleShape)
            .useBrush(brush)
      )
   }
}
