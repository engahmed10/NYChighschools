package com.example.nychighschools

interface HighSchoolRepository {

    suspend fun getHighSchools():ArrayList<HighSchoolDto>
}