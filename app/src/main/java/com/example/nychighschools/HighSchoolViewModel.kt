package com.example.nychighschools

import androidx.lifecycle.ViewModel

class HighSchoolViewModel:  ViewModel() {

    lateinit var highSchoolRepositoryImpl: HighSchoolRepository
    lateinit var api: HighSchoolApi

    suspend fun getHighSchoolData(): ArrayList<HighSchoolDto> {
        var api = RetrofitHelper().getApiService()
        highSchoolRepositoryImpl = HighSchoolRepositoryImpl(api)
        var schools =  highSchoolRepositoryImpl.getHighSchools()
        return schools
    }


}