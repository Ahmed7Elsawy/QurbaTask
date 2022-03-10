package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.data.PostType
import com.elsawy.task.qurba.data.User
import com.elsawy.task.qurba.ui.theme.Black
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme


@Composable
fun PostHeader(
   user: User,
   time: String,
   postType: PostType,
   groupName: String,
   margin: Dp = 16.dp,
   paddingTop: Dp = 12.dp,
   notShared: Boolean = true,
) {
   ConstraintLayout(
      modifier = Modifier
         .fillMaxWidth()
         .padding(top = paddingTop)
   ) {
      val (imageRef, nameRef, groupRef, timeRef, menuRef, optionsRef) = createRefs()

      Image(
         painter = painterResource(user.imageId),
         contentDescription = "Contact profile picture",
         contentScale = ContentScale.Crop,
         modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .constrainAs(imageRef) {
               start.linkTo(parent.start, margin = margin)
            }
      )

      Text(
         text = user.name,
         fontSize = 14.sp,
         fontWeight = FontWeight.Bold,
         color = Black,
         modifier = Modifier
            .constrainAs(nameRef) {
               top.linkTo(parent.top, margin = 5.dp)
               start.linkTo(imageRef.end, margin = 12.dp)
            }
      )

      if (groupName.isNotEmpty()) {
         Text(
            text = groupName,
            maxLines = 2,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier
               .constrainAs(groupRef) {
                  top.linkTo(nameRef.top)
                  start.linkTo(menuRef.end)
                  end.linkTo(optionsRef.start, margin = 8.dp)
                  width = Dimension.fillToConstraints
               }
         )
      }

      Text(
         text = "${if (user.isVerifiedBuyer) "Verified Buyer  •  " else ""}$time",
         fontSize = 12.sp,
         color = Black.copy(.5f),
         modifier = Modifier
            .constrainAs(timeRef) {
               start.linkTo(nameRef.start)
               top.linkTo(nameRef.bottom)
            }
      )

      when (postType) {
         PostType.SharedPost -> {
            ArrowIcon(Modifier.constrainAs(menuRef) {
               start.linkTo(nameRef.end)
            })
         }
         PostType.RestaurantPost -> {
            RestaurantIcon(modifier = Modifier.constrainAs(menuRef) {
               top.linkTo(nameRef.top)
               start.linkTo(nameRef.end, margin = 8.dp)
            })
         }
         else -> {
            BuyerIcon(modifier = Modifier.constrainAs(menuRef) {
               top.linkTo(nameRef.top)
               start.linkTo(nameRef.end, margin = 8.dp)
            })
         }
      }

      // hide option icon in shared posts
      if (notShared) {
         Icon(painter = painterResource(id = R.drawable.ic_options),
            contentDescription = "options",
            modifier = Modifier
               .size(22.dp)
               .useBrush(brush)
               .constrainAs(optionsRef) {
                  top.linkTo(nameRef.top)
                  end.linkTo(parent.end, margin = 16.dp)
               }
         )
      }
   }
}

@Composable
private fun BuyerIcon(modifier: Modifier) {
   Icon(
      painter = painterResource(R.drawable.ic_verified),
      contentDescription = "user icon",
      modifier = Modifier
         .size(18.dp)
         .clip(CircleShape)
         .background(brush)
         .then(modifier)
   )
}

@Composable
private fun RestaurantIcon(modifier: Modifier) {
   Icon(
      painter = painterResource(R.drawable.ic_menu),
      contentDescription = "restaurant icon",
      modifier = Modifier
         .size(18.dp)
         .clip(CircleShape)
         .background(brush)
         .padding(4.dp)
         .then(modifier)

   )
}

@Composable
private fun ArrowIcon(modifier: Modifier) {
   Icon(
      painter = painterResource(R.drawable.ic_arrow),
      contentDescription = "arrow",
      modifier = Modifier
         .size(28.dp)
         .useBrush(brush)
         .then(modifier)
   )
}


@Preview(showBackground = true)
@Composable
fun PostHeaderPreview() {
   QurbaTaskTheme {
      PostHeader(
         user = User(name = "Chicken Chester", imageId = R.drawable.profile_image),
         time = "2 days ago",
         groupName = "",
         postType = PostType.BuyerPost)
   }
}