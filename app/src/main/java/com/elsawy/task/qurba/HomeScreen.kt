package com.elsawy.task.qurba

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.elsawy.task.qurba.components.WritePostCard

@Composable
fun HomeScreen() {
   Box(modifier = Modifier.fillMaxSize()) {
      WritePostCard()

   }

}
