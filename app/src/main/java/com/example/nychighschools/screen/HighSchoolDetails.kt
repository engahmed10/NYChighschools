package com.example.nychighschools.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HighSchoolDetails(navController: NavHostController, overviewParagraph: String?){

      if (overviewParagraph != null) {
            Text(modifier = Modifier.padding(20.dp),text = overviewParagraph)
      }


}