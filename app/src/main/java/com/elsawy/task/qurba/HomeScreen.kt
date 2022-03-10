package com.elsawy.task.qurba

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elsawy.task.qurba.ui.components.BigDivider
import com.elsawy.task.qurba.ui.components.PostCard
import com.elsawy.task.qurba.ui.components.WritePostCard
import com.elsawy.task.qurba.data.Post
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
   val homeViewModel: HomeViewModel = viewModel()
   val scope = rememberCoroutineScope()

   LazyColumn(modifier = Modifier.fillMaxSize()) {
      item {
         WritePostCard()
      }
      item {
         BigDivider()
      }

      scope.launch {
         delay(1000)
         homeViewModel.loadPosts()
      }

      when (homeViewModel.state) {
         is State.Loading ->
            items(3) {
               ShimmerScreen()
            }
         is State.Success ->
            items((homeViewModel.state as State.Success).posts) { post ->
               PostCard(post)
            }
      }

   }

}

@Composable
private fun ShowPosts(posts: List<Post>) {
   LazyColumn(modifier = Modifier.fillMaxSize()) {
      items(posts) { post ->
         PostCard(post)
      }
   }
}