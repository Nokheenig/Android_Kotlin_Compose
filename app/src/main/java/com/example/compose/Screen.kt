package com.example.compose

sealed class Screen (val route:String) {
    object MainScreen : Screen("MainScreen")
    object DetailScreen : Screen("DetailScreen") // Teacher forgot to update route here
}