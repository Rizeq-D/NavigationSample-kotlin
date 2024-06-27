package com.example.navigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationsample.ui.theme.NavigationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    TheApp()
                }
            }
        }
    }
}

@Composable
fun TheApp() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screenNu1") {
        composable("screenNu1"){
            ScreenNu1 {name ->
                navController.navigate("screenNu2/$name")
            }
        }

        composable("screenNu2/{name}"){
            val name = it.arguments?.getString("name") ?: "no name"
            ScreenNu2(name) {
                navController.navigate("screenNu3")
            }
        }

        composable(route = "screenNu3") {
            ScreenNu3 {
                navController.navigate("screenNu1")}
        }
    }
}