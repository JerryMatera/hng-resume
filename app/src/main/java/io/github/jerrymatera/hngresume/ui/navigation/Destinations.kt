package io.github.jerrymatera.hngresume.ui.navigation

sealed class Destinations(val route:String){
    object Home: Destinations(route = "home")
    object About: Destinations(route = "about")
    object Work: Destinations(route = "work")
}
