package com.elsawy.task.qurba.data

import com.elsawy.task.qurba.R

data class Restaurant(val name: String, val order: String, val logo: Int)

val restaurants = arrayOf(
   Restaurant(name = "Chicken Chester",
      order = "Buy 2 Chicken Burger Combo and 2 Chicken Burger Combo",
      logo = R.drawable.user1),
   Restaurant(name = "Mcdonald's",
      order = "Chicken MACDO, Carmel Sandae, Fries, and Carmel Sandae",
      logo = R.drawable.mac),
)