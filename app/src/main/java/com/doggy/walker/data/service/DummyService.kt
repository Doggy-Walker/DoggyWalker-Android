package com.doggy.walker.data.service

import com.doggy.walker.data.dto.response.DummyBaseResponse
import com.doggy.walker.data.dto.response.DummyResponseDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface DummyService {
    @GET("api/users")
    suspend fun getDummyLists(
        @Header("x-api-key") apiKey: String = "reqres-free-v1",
        @Query("page") page: Int = 2
    ): DummyBaseResponse<DummyResponseDto>
}