package com.example.nychighschools

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
////https://data.cityofnewyork.us/resource/s3k6-pzi2.json
class RetrofitHelper {
    fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://data.cityofnewyork.us/resource/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getApiService(): HighSchoolApi{
        return getRetrofit().create(HighSchoolApi::class.java)
    }
}