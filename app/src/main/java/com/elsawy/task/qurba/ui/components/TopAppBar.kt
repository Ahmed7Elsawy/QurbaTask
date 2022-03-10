package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.elsawy.task.qurba.R


@Composable
fun QurbaTopAppBar() {
   TopAppBar(
      title = {
         Icon(painter = painterResource(id = R.drawable.logo),
            modifier = Modifier.useBrush(brush),
            contentDescription = "LOGO")
      },
      actions = {

         IconButton(onClick = { }) {
            Icon(Icons.Filled.Search,
               modifier = Modifier.useBrush(brush),
               contentDescription = "search")
         }

         IconButton(onClick = { }) {
            ActionWithBadge(imageVector = Icons.Filled.Notifications,
               description = "Notifications",
               alignment = Alignment.BottomEnd)
         }

         IconButton(onClick = { }) {
            ActionWithBadge(
               imageVector = Icons.Filled.ShoppingCart,
               description = "Shopping Cart",
               alignment = Alignment.TopEnd)
         }
      },
      backgroundColor = MaterialTheme.colors.primary,
      contentColor = Color.White,
      elevation = 10.dp
   )
}

@Composable
private fun ActionWithBadge(
   imageVector: ImageVector,
   description: String,
   alignment: Alignment,
   isBadgeVisible: Boolean = true,
) {
   Box {
      Icon(imageVector,
         modifier = Modifier.useBrush(brush),
         contentDescription = description)
      if (isBadgeVisible) {
         Box(
            modifier = Modifier
               .size(10.dp)
               .clip(CircleShape)
               .background(Color.White)
               .padding(1.dp)
               .clip(CircleShape)
               .background(MaterialTheme.colors.secondary)
               .align(alignment)
         )
      }
   }
}