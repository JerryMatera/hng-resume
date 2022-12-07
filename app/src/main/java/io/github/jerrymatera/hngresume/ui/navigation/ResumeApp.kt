package io.github.jerrymatera.hngresume.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.jerrymatera.hngresume.ui.screens.About
import io.github.jerrymatera.hngresume.ui.screens.Home
import io.github.jerrymatera.hngresume.ui.screens.Work

@Composable
fun ResumeApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Scaffold {
        NavHost(
            navController = navController,
            startDestination = Destinations.Home.route,
            modifier = modifier.padding(it)
        ) {
            composable(route = Destinations.Home.route) {
                Home(navController)
            }
            composable(route = Destinations.About.route) {
                About()
            }
            composable(route = Destinations.Work.route) {
                Work()
            }
        }
    }
}