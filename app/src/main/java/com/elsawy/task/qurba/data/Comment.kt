package com.elsawy.task.qurba.data

data class Comment(
   val user: User,
   val body: String,
   val time: String,
   val likesCount: String,
)


val comments = arrayOf(
   Comment(user = users[1],
      body = "Lorem ipsum",
      time = "1h",
      likesCount = "2"
   ),
   Comment(user = users[3],
      body = "Good Order",
      time = "5h",
      likesCount = "10"
   )
)