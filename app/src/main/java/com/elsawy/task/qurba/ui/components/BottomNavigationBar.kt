package com.elsawy.task.qurba.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.elsawy.task.qurba.HomeScreen
import com.elsawy.task.qurba.R
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme

@Composable
fun BottomNavigationBar(navController: NavController) {
   val items = listOf(
      NavigationItem.Home,
      NavigationItem.Menu,
      NavigationItem.Settings,
      NavigationItem.Friends,
      NavigationItem.Profile)

   BottomNavigation(
      backgroundColor = Color.White,
      contentColor = Color.White
   ) {
      val navBackStackEntry by navController.currentBackStackEntryAsState()
      val currentRoute = navBackStackEntry?.destination?.route
      items.forEach { item ->
         BottomNavigationItem(
            icon = {
               Icon(painter = painterResource(id = item.icon),
                  contentDescription = item.title,
                  modifier =
                  if (currentRoute != item.route) {
                     Modifier
                        .size(20.dp)
                        .useBrush(brush)
                  } else {
                     Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(brush)
                        .padding(10.dp)

                  }
               )
            },
            selected = true,
            onClick = {
               navController.navigate(item.route) {
                  navController.graph.startDestinationRoute?.let { route ->
                     popUpTo(route) {
                        saveState = true
                     }
                  }
                  launchSingleTop = true
                  restoreState = true
               }
            })
      }
   }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
   NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
      composable(NavigationItem.Home.route) {
         HomeScreen()
      }
      composable(NavigationItem.Menu.route) {
      }
      composable(NavigationItem.Settings.route) {
      }
      composable(NavigationItem.Friends.route) {
      }
      composable(NavigationItem.Profile.route) {
      }
   }
}

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
   object Home : NavigationItem("home", R.drawable.ic_home, "Home")
   object Menu : NavigationItem("Menu", R.drawable.ic_menu, "Menu")
   object Settings : NavigationItem("Settings", R.drawable.ic_settings, "Settings")
   object Friends : NavigationItem("Friends", R.drawable.ic_friends, "Friends")
   object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
   QurbaTaskTheme {
      BottomNavigationBar(navController = rememberNavController())
   }
}