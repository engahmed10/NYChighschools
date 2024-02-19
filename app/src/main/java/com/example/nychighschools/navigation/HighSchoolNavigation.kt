package com.example.nychighschools.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nychighschools.screen.HighSchoolDetails
import com.example.nychighschools.screen.MainScreen


@Composable
fun  HighSchoolNavigation(navController: NavHostController) {

    NavHost(navController = navController , startDestination = NavigationRoute.MainScreen.route){

        composable(NavigationRoute.MainScreen.route){

            MainScreen(navController)
        }

        composable(NavigationRoute.HighSchoolDetails.route+"?overview={overview}"){
            backStack ->
           val overview = backStack.arguments?.getString("overview")
            HighSchoolDetails(navController = navController, overview)
        }



    }

}