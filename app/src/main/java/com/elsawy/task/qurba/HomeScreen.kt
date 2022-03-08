package com.elsawy.task.qurba

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.elsawy.task.qurba.components.PostCard
import com.elsawy.task.qurba.components.WritePostCard

@Composable
fun HomeScreen() {
//   Box(modifier = Modifier.fillMaxSize()) {
   LazyColumn(modifier = Modifier.fillMaxSize()) {
      item {
         WritePostCard()
      }
      items(2) {
         PostCard()
      }
   }
//   }

}
