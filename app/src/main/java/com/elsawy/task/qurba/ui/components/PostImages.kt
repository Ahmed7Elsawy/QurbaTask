package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PostImages(images: List<Int>) {

   when (images.size) {
      1 -> OneImage(imageId = images[0])
      2 -> TwoImages(images)
      else -> ThreeImages(images)
   }
}


@Composable
fun OneImage(imageId: Int) {
   Image(
      painter = painterResource(imageId),
      contentDescription = "post Image",
      contentScale = ContentScale.Fit,
      modifier = Modifier
         .fillMaxWidth()
         .height(192.dp)
   )
}

@Composable
fun TwoImages(images: List<Int>) {
   Row(modifier = Modifier
      .fillMaxWidth()
      .height(192.dp)) {
      Image(
         painter = painterResource(images[0]),
         contentDescription = "post Image",
         contentScale = ContentScale.FillBounds,
         modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
      )

      Spacer(modifier = Modifier
         .fillMaxHeight()
         .width(4.dp)
         .background(Color.White))

      Image(
         painter = painterResource(images[1]),
         contentDescription = "post Image",
         contentScale = ContentScale.FillBounds,
         modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
      )
   }
}

@Composable
fun ThreeImages(images: List<Int>) {

   Row(modifier = Modifier
      .fillMaxWidth()
      .height(192.dp)) {
      Image(
         painter = painterResource(images[0]),
         contentDescription = "post Image",
         contentScale = ContentScale.FillBounds,
         modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
      )
      Spacer(modifier = Modifier
         .fillMaxHeight()
         .width(4.dp)
         .background(Color.White))

      Column(modifier = Modifier
         .weight(1f)
         .fillMaxHeight()
      ) {
         Image(
            painter = painterResource(images[1]),
            contentDescription = "post Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
               .weight(1f)
               .fillMaxWidth()
         )

         Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(4.dp)
            .background(Color.White))

         Image(
            painter = painterResource(images[2]),
            contentDescription = "post Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
               .weight(1f)
               .fillMaxWidth()
         )
      }
   }
}
