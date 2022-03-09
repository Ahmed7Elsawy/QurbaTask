package com.elsawy.task.qurba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.elsawy.task.qurba.components.BottomNavigationBar
import com.elsawy.task.qurba.components.NavigationGraph
import com.elsawy.task.qurba.components.QurbaTopAppBar
import com.elsawy.task.qurba.ui.theme.QurbaTaskTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         MainScreen()
      }
   }
}

@Composable
private fun MainScreen() {
   QurbaTaskTheme {

      val navController = rememberNavController()
      Scaffold(modifier = Modifier.fillMaxSize(),
         topBar = { QurbaTopAppBar() },
         bottomBar = { BottomNavigationBar(navController) }
      ) { innerPadding ->
         // Apply the padding globally to the whole BottomNavScreensController
         Box(modifier = Modifier.padding(innerPadding)) {
            NavigationGraph(navController)
         }
      }
   }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   QurbaTaskTheme {
      MainScreen()
   }
}