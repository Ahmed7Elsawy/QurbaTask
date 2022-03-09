package com.elsawy.task.qurba.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elsawy.task.qurba.data.*
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme

@Composable
fun PostCard(post: Post) {
   PostHeader(
      user = post.user, time = post.postTime,
      postType = post.postType,
      groupName = post.groupName,
   )
   PostCaption(post.body.caption)
   when (post.postType) {
      is PostType.SharedPost -> {
         post.sharedPost?.let { SharedPost(post = it) }
         PostReactions(post.reactions)
      }
      is PostType.RestaurantPost -> {
         PostImages(post.body.images)
         PostOrderInfo(post.restaurant)
         ViewMenuButton()
         SmallDivider()
         PostReactions(post.reactions, verticalPadding = 7.5.dp)
         SmallDivider()
         CommentCard(post.comment)
      }
      is PostType.BuyerPost -> {
         PostImages(post.body.images)
         PostOrderInfo(post.restaurant)
         SmallDivider()
         PostReactions(post.reactions)
      }
   }

   BigDivider()
}


@Composable
private fun SharedPost(post: Post) {
   Card(
      modifier = Modifier
         .fillMaxWidth()
         .padding(horizontal = 16.dp, vertical = 2.dp),
      shape = RoundedCornerShape(7.dp),
      border = BorderStroke(1.dp, Color(0xFFCACACA)),
   ) {
      Column {
         PostHeader(
            user = post.user, time = post.postTime,
            postType = post.postType,
            groupName = "", margin = 8.dp, paddingTop = 8.dp, notShared = false
         )
         PostCaption(post.body.caption, horizontalMargin = 8.dp)
         PostImages(post.body.images)
         PostOrderInfo(post.restaurant, horizontalMargin = 8.dp)
      }
   }
}


@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
   QurbaTaskTheme {
      PostCard(posts[0])
   }
}