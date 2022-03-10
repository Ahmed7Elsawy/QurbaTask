package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elsawy.task.qurba.R

@Composable
fun WritePostCard() {
   Row(modifier = Modifier
      .fillMaxWidth()
      .padding(horizontal = 16.dp, vertical = 13.dp),
      verticalAlignment = Alignment.CenterVertically
   )
   {
      var textFieldState by remember {
         mutableStateOf("")
      }
      Image(
         painter = painterResource(R.drawable.profile_image),
         contentDescription = "Contact profile picture",
         contentScale = ContentScale.Crop,
         modifier = Modifier
            .size(40.dp)
            .clip(CircleShape),
         alignment = Alignment.Center,
      )
      Spacer(modifier = Modifier.width(12.dp))

      Surface(modifier = Modifier
         .fillMaxWidth(),
         elevation = 5.dp, shape = RoundedCornerShape(20.dp)) {
         TextField(
            value = textFieldState,
            onValueChange = {
               textFieldState = it
            },
            singleLine = true,
            placeholder = {
               Text(
                  text = "Share your food experiences",
                  fontSize = 12.sp,
                  fontWeight = FontWeight(400),
                  color = Color.Black.copy(.4f),
                  modifier = Modifier.background(Color.White)
               )
            },
            colors = TextFieldDefaults.textFieldColors(
               backgroundColor = Color.White,
               textColor = Color.Black,
               focusedIndicatorColor = Color.Transparent,
               disabledIndicatorColor = Color.Transparent,
               unfocusedIndicatorColor = Color.Transparent,
            )
         )
      }
   }
}