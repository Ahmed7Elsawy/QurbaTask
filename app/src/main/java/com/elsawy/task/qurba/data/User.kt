package com.elsawy.task.qurba.data

import com.elsawy.task.qurba.R

data class User(val name: String, val imageId: Int, val isVerifiedBuyer: Boolean = false)

val users = arrayOf(
   User(name = "Chicken Chester", R.drawable.user1),
   User(name = "Jaxson Schleifer", R.drawable.user2),
   User(name = "Rayna Rosser", R.drawable.user3, isVerifiedBuyer = true),
   User(name = "Skylarani  Arcand", R.drawable.user4),
   User(name = "Rayna Rhiel Madsen", R.drawable.user5),
)
