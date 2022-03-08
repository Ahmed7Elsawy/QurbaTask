package com.elsawy.task.qurba.components

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.ui.theme.Black
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme


@Composable
fun PostHeader(
   imageId: Int = R.drawable.profile_image,
   username: String = "Chicken Chester",
   time: String = "2 days ago",
   isVerifiedBuyer: Boolean = false,
   groupName: String = "",
) {
   ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
      val (imageRef, nameRef, groupRef, timeRef, menuRef, optionsRef) = createRefs()

      Image(
         painter = painterResource(imageId),
         contentDescription = "Contact profile picture",
         contentScale = ContentScale.Crop,
         modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .constrainAs(imageRef) {
               start.linkTo(parent.start, margin = 16.dp)
            }
      )

      Text(
         text = username,
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
               .fillMaxWidth()
               .constrainAs(groupRef) {
                  top.linkTo(nameRef.top)
                  start.linkTo(menuRef.end)
//                  end.linkTo(optionsRef.start, margin = 8.dp)
               }
         )
      }

      Text(
         text = "${if (isVerifiedBuyer) "Verified Buyer  •  " else ""}$time",
         fontSize = 12.sp,
         color = Black.copy(.5f),
         modifier = Modifier
            .constrainAs(timeRef) {
               start.linkTo(nameRef.start)
               top.linkTo(nameRef.bottom)
            }
      )


      if (groupName.isNotEmpty()) {
         Icon(painter = painterResource(R.drawable.ic_arrow),
            contentDescription = "arrow",
            modifier = Modifier
               .size(28.dp)
               .useBrush(brush)
               .constrainAs(menuRef) {
                  start.linkTo(nameRef.end)
               }
         )
      } else {
         Icon(painter = painterResource(id = if (isVerifiedBuyer) R.drawable.ic_verified else R.drawable.ic_menu),
            contentDescription = "menu",
            modifier = Modifier
               .size(18.dp)
               .clip(CircleShape)
               .background(brush)
               .padding(if (isVerifiedBuyer) 0.dp else 4.dp)
               .constrainAs(menuRef) {
                  top.linkTo(nameRef.top)
                  start.linkTo(nameRef.end, margin = 8.dp)
               }
         )
      }

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


@Preview(showBackground = true)
@Composable
fun PostHeaderPreview() {
   QurbaTaskTheme {
      PostHeader()
   }
}