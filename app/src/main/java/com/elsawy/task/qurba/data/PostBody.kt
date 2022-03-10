package com.elsawy.task.qurba.data

import com.elsawy.task.qurba.R

data class PostBody(val caption: String, val images: List<Int>)


val postBodies = arrayOf(
   PostBody(caption = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
      images = listOf(R.drawable.food1)),
   PostBody(caption = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
      images = listOf(R.drawable.food2, R.drawable.food3)),
   PostBody(caption = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
      images = listOf(R.drawable.food2, R.drawable.food3, R.drawable.food4)),

   PostBody(caption = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
      images = listOf())
)