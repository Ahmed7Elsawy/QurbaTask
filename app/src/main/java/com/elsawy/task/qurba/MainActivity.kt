package com.elsawy.task.qurba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.elsawy.task.qurba.components.BottomNavigationBar
import com.elsawy.task.qurba.components.NavigationGraph
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         QurbaTaskTheme {
            // A surface container using the 'background' color from the theme
//            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//               Greeting("Android")
//            }
            MainScreen()
         }
      }
   }
}

@Composable
private fun MainScreen() {
   val navController = rememberNavController()
   Scaffold(modifier = Modifier.fillMaxSize(),
      bottomBar = { BottomNavigationBar(navController) }
   ) {
      NavigationGraph(navController)
   }
}

//@Composable
//private fun BottomNavigationBar(navController: NavController) {
//   val items = listOf(
//      NavigationItem.Home,
//      NavigationItem.Menu,
//      NavigationItem.Settings,
//      NavigationItem.Friends,
//      NavigationItem.Profile)
//
//   BottomNavigation(
//      backgroundColor = colorResource(id = R.color.white),
////      backgroundColor = colorResource(id = R.color.white),
//      contentColor = Color.White
////      contentColor = colorResource(id = R.color.purple_200)
//   ) {
//      val navBackStackEntry by navController.currentBackStackEntryAsState()
//      val currentRoute = navBackStackEntry?.destination?.route
//
//      items.forEach { item ->
//         BottomNavigationItem(
//            icon = {
//               Icon(painter = painterResource(id = item.icon),
//                  contentDescription = item.title,
//                  modifier =
//                  if (currentRoute != item.route) {
//                     Modifier
//                        .size(20.dp)
//                        .textBrush(Brush.horizontalGradient(
//                           colors = listOf(
//                              Color.Red,
//                              Color.Green
//                           )))
//                  } else {
//                     Modifier
//                        .size(45.dp)
////                        .padding(10.dp)
//                        .clip(CircleShape)
//                        .background(
//                           Brush.horizontalGradient(
//                              colors = listOf(
//                                 Color.Red,
//                                 Color.Green
//                              ))
//                        )
//                        .padding(10.dp)
//
//                  }
//
//               )
//            },
////            label = {
////               Text(text = item.title,
////                  fontSize = 16.sp,
////                  modifier = Modifier.textBrush(Brush.horizontalGradient(
////                     colors = listOf(
////                        Color.Red,
////                        Color.Green
////                     ))))
////            },
////            selectedContentColor = MaterialTheme.colors.background,
////            selectedContentColor = mod,
//            unselectedContentColor = Color.Green,
//            selected = currentRoute == item.route,
//            onClick = {
//               navController.navigate(item.route) {
//                  navController.graph.startDestinationRoute?.let { route ->
//                     popUpTo(route) {
//                        saveState = true
//                     }
//                  }
//                  // Avoid multiple copies of the same destination when reselecting the same item
//                  launchSingleTop = true
//                  // Restore state when reselecting a previously selected item
//                  restoreState = true
//               }
//            })
//      }
//   }
//}

//fun Modifier.textBrush(brush: Brush) = this
//   .graphicsLayer(alpha = 0.99f)
//   .drawWithCache {
//      onDrawWithContent {
//         drawContent()
//         drawRect(brush, blendMode = BlendMode.SrcAtop)
//      }
//   }

//@Composable
//private fun NavigationGraph(navController: NavHostController) {
//   NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
//      composable(NavigationItem.Home.route) {
////         HomeScreen()
//      }
//      composable(NavigationItem.Menu.route) {
////         HomeScreen()
//      }
//      composable(NavigationItem.Settings.route) {
////         HomeScreen()
//      }
//      composable(NavigationItem.Friends.route) {
////         HomeScreen()
//      }
//      composable(NavigationItem.Profile.route) {
////         HomeScreen()
//      }
//   }
//}
//
//sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
//   object Home : NavigationItem("home", R.drawable.ic_home, "Home")
//   object Menu : NavigationItem("Menu", R.drawable.ic_menu, "Menu")
//   object Settings : NavigationItem("Settings", R.drawable.ic_settings, "Settings")
//   object Friends : NavigationItem("Friends", R.drawable.ic_friends, "Friends")
//   object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
//}

@Composable
fun Greeting(name: String) {
   Text(text = "Hello $name!")

   val x = Brush.verticalGradient(
      colors = listOf(
         Color.Red,
         Color.Black
      ),
      startY = 300f
   )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   QurbaTaskTheme {
//      Greeting("Android")
//      BottomNavigationBar(navController = rememberNavController())
      MainScreen()
   }
}