package com.example.rankiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTargetMarker
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController


class AuthenticationScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
//                surface represents the frame of the screen
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
//                    make a call to the navController function
//                    for navigation purpose we set up a navController
//                    to redirect screens based off a click event
                    AppNavigation()

                }
            }
        }
    }
    @Composable
    fun AppNavigation(){
//        the navController is part of the navigation
    //        concept of the jetpack compose.
    //        It manages app navigation = it helps in movement btw different
    //        composable and handles the back stack A -> B <-> C
//        NavController "
//        1. You tell it where to go (navigate())
//        2. it remembers where you have been
//        3. and it lets you go back (popBackStack())
//        Initialize the navController reference
        val navController = rememberNavController()
    }

}