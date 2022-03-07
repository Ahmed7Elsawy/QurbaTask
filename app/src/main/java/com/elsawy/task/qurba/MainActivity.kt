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


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   QurbaTaskTheme {
      MainScreen()
   }
}