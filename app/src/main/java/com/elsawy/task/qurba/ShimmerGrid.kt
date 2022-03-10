package com.elsawy.task.qurba

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elsawy.task.qurba.ui.components.BigDivider
import com.elsawy.task.qurba.ui.theme.LightGray1
import com.elsawy.task.qurba.ui.theme.LightGray2


@Composable
fun ShimmerScreen() {
   Column {
      ShimmerPostItem()
      BigDivider()
   }
}

@Composable
private fun ShimmerPostItem() {
   Column(modifier = Modifier
      .fillMaxWidth()) {

      Row(
         modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.5.dp, top = 11.5.dp, bottom = 8.dp),
         verticalAlignment = Alignment.CenterVertically
      ) {
         Spacer(
            modifier = Modifier
               .size(41.dp)
               .clip(CircleShape)
               .background(LightGray1)
         )
         Spacer(modifier = Modifier.width(7.5.dp))
         Column(verticalArrangement = Arrangement.Center) {
            Spacer(
               modifier = Modifier
                  .height(10.dp)
                  .width(119.dp)
                  .clip(RoundedCornerShape(4.dp))
                  .background(LightGray1)
            )
            Spacer(modifier = Modifier.height(9.dp))
            Spacer(
               modifier = Modifier
                  .height(10.dp)
                  .width(64.dp)
                  .clip(RoundedCornerShape(4.dp))
                  .background(LightGray1)
            )
         }
      }

      Spacer(
         modifier = Modifier
            .fillMaxWidth()
            .height(192.dp)
            .background(LightGray2)
      )
      Box(
         modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 15.dp, bottom = 17.5.dp, end = 19.dp),
      ) {
         Spacer(
            modifier = Modifier
               .height(10.dp)
               .width(51.dp)
               .clip(RoundedCornerShape(4.dp))
               .background(LightGray1)
               .align(Alignment.CenterStart)
         )
         Spacer(
            modifier = Modifier
               .height(10.dp)
               .width(51.dp)
               .clip(RoundedCornerShape(4.dp))
               .background(LightGray1)
               .align(Alignment.Center)
         )
         Spacer(
            modifier = Modifier
               .height(10.dp)
               .width(51.dp)
               .clip(RoundedCornerShape(4.dp))
               .background(LightGray1)
               .align(Alignment.CenterEnd)
         )
      }
   }
}


@Composable
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
fun ShimmerGridItemDarkPreview() {
   ShimmerPostItem()
}