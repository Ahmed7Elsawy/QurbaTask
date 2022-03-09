package com.elsawy.task.qurba.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.data.Reactions
import com.elsawy.task.qurba.ui.theme.Black

@Composable
fun PostReactions(
   reactions: Reactions,
   verticalPadding: Dp = 12.dp,
) {
   Box(modifier = Modifier
      .fillMaxWidth()
      .padding(horizontal = 16.dp, vertical = verticalPadding)
   ) {
      Reaction(Modifier.align(Alignment.CenterStart), reactions.likes, R.drawable.ic_like)
      Reaction(Modifier.align(Alignment.Center), reactions.comments, R.drawable.ic_comment)
      Reaction(Modifier.align(Alignment.BottomEnd), reactions.shares, R.drawable.ic_share)
   }
}

@Composable
fun Reaction(modifier: Modifier, count: String, iconId: Int) {
   Row(modifier = modifier) {
      Text(
         text = count,
         fontSize = 14.sp,
         fontWeight = FontWeight.Medium,
         color = Black
      )
      Spacer(modifier = Modifier.width(4.dp))
      Icon(painter = painterResource(id = iconId),
         contentDescription = "likes",
         modifier = Modifier
            .size(20.dp)
            .useBrush(brush)
      )
   }

}
