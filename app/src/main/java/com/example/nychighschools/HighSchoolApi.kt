package com.example.nychighschools

import retrofit2.http.GET

interface HighSchoolApi {

    @GET("s3k6-pzi2.json")
    suspend fun getHighSchools(): ArrayList<HighSchoolDto>
}