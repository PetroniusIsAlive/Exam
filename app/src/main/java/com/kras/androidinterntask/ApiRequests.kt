package com.kras.androidinterntask

import com.kras.androidinterntask.api.WorldStats
import retrofit2.Call
import retrofit2.http.GET


interface ApiRequests {
    @GET("/rest/v2/all")
    fun getWorldData(): Call<WorldStats>


}