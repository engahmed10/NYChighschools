package com.example.nychighschools

import com.google.gson.annotations.SerializedName

data class HighSchoolDto(
    @SerializedName("school_name")  val schoolName : String,
    @SerializedName("dbn")  val dbn: String,
    @SerializedName("overview_paragraph") val overviewParagraph: String
)
