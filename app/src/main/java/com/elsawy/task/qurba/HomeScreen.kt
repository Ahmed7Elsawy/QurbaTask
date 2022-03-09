package com.elsawy.task.qurba

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.elsawy.task.qurba.components.BigDivider
//import com.elsawy.task.qurba.components.PostCard
import com.elsawy.task.qurba.components.PostCard
import com.elsawy.task.qurba.components.WritePostCard
import com.elsawy.task.qurba.data.posts

@Composable
fun HomeScreen() {
//   Box(modifier = Modifier.fillMaxSize()) {
   LazyColumn(modifier = Modifier.fillMaxSize()) {
      item {
         WritePostCard()
      }
      item {
         BigDivider()
      }

      items(posts) { post ->
         PostCard(post)
      }

   }
//   }

}
