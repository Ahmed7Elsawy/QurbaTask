package com.elsawy.task.qurba.data


data class Post(
   val user: User,
   val body: PostBody,
   val restaurant: Restaurant,
   val reactions: Reactions,
   val comment: Comment,
   val postTime: String,
   val postType: PostType,
   val sharedPost: Post? = null,
   val groupName: String = "",
)

val posts = listOf(
   Post(
      user = users[0],
      body = postBodies[0],
      restaurant = restaurants[0],
      reactions = reactions[0],
      comment = comments[0],
      postTime = "2 days ago",
      postType = PostType.RestaurantPost,
   ),
   Post(
      user = users[2],
      body = postBodies[1],
      restaurant = restaurants[1],
      reactions = reactions[1],
      comment = comments[1],
      postTime = "5 days ago",
      postType = PostType.BuyerPost
   ),
   Post(
      user = users[3],
      body = postBodies[2],
      restaurant = restaurants[0],
      reactions = reactions[2],
      comment = comments[0],
      postTime = "8 days ago",
      postType = PostType.BuyerPost
   ),
   Post(
      user = users[4],
      body = postBodies[3],
      restaurant = restaurants[1],
      reactions = reactions[0],
      comment = comments[1],
      postTime = "1 days ago",
      groupName = "Chicken",
      postType = PostType.SharedPost,
      sharedPost = Post(
         user = users[0],
         body = postBodies[0],
         restaurant = restaurants[0],
         reactions = reactions[0],
         comment = comments[0],
         postTime = "2 days ago",
         postType = PostType.RestaurantPost
      )
   ),
)

sealed class PostType {
   object RestaurantPost : PostType()
   object BuyerPost : PostType()
   object SharedPost : PostType()
}