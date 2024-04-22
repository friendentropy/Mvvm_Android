package com.yegon.mvvm_morning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yegon.mvvm_morning.ui.theme.screens.about.About
import com.yegon.mvvm_morning.ui.theme.screens.home.HomeScreen
import com.yegon.mvvm_morning.ui.theme.screens.login.LoginScreen
import com.yegon.mvvm_morning.ui.theme.screens.registration.RegistrationScreen
import com.yegon.mvvm_morning.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            About(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTRATION){
            RegistrationScreen(navController)
        }
    }



}