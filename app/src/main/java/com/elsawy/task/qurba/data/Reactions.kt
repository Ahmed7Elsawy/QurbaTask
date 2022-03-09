package com.elsawy.task.qurba.data

data class Reactions(val likes: String, val comments: String, val shares: String)

val reactions = arrayOf(
   Reactions(likes = "32K", comments = "597", shares = "12.3k"),
   Reactions(likes = "15k", comments = "1k", shares = "10k"),
   Reactions(likes = "12k", comments = "200", shares = "134"),
)