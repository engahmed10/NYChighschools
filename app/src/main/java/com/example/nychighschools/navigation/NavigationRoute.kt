package com.example.nychighschools.navigation

sealed class NavigationRoute(val route: String){
     object  MainScreen: NavigationRoute("main_screen")
     object HighSchoolDetails: NavigationRoute("higj_school_details")

}