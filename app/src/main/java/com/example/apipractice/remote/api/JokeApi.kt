package com.example.apipractice.remote.api

import com.example.apipractice.remote.model.JokeResponse
import retrofit2.http.GET

internal interface JokeApi {

    @GET("/")
    suspend fun getRandomJoke(): JokeResponse
}