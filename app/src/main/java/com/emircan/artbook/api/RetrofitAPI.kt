package com.emircan.artbook.api

import com.emircan.artbook.model.ImageResponse
import com.emircan.artbook.util.Util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery : String,
        @Query("key") apikey : String = API_KEY
    ) : Response<ImageResponse>
}