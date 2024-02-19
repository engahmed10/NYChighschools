package com.example.nychighschools

class HighSchoolRepositoryImpl constructor(private val api : HighSchoolApi ): HighSchoolRepository {
    override suspend fun getHighSchools(): ArrayList<HighSchoolDto> {
        return api.getHighSchools()
    }

}