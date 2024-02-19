package com.example.nychighschools.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.nychighschools.HighSchoolDto
import com.example.nychighschools.HighSchoolViewModel
import com.example.nychighschools.navigation.NavigationRoute

@Composable
fun MainScreen(navHostController: NavHostController, modifier: Modifier = Modifier){
    val viewModel: HighSchoolViewModel  = viewModel()

     var highSchool:MutableState<ArrayList<HighSchoolDto>> = remember {
           mutableStateOf<ArrayList<HighSchoolDto>>(arrayListOf())
     }

    LaunchedEffect(Unit){

        highSchool.value = viewModel.getHighSchoolData()
    }


    LazyColumn{
         items(highSchool.value){
             Box(modifier.padding(100.dp,0.dp,0.dp,0.dp)) {
                 ElevatedCard(
                     modifier
                         .height(200.dp)
                         .width(200.dp).clickable {

                             navHostController.navigate(NavigationRoute.HighSchoolDetails
                                 .route+"?overview=${it.overviewParagraph}")
                         }) {
                     Text(text = it.dbn)
                     Spacer(modifier = modifier.height(5.dp).fillMaxWidth())
                     Text(text = it.schoolName)

                 }
             }

         }
    }

}