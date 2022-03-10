package com.elsawy.task.qurba

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.elsawy.task.qurba.data.Post
import com.elsawy.task.qurba.data.posts

class HomeViewModel : ViewModel() {

   var state: State by mutableStateOf(State.Loading)
      private set

   fun loadPosts() {
      state = State.Success(posts)
   }

}

sealed class State {
   object Loading : State()
   data class Success(val posts: List<Post>) : State()
}