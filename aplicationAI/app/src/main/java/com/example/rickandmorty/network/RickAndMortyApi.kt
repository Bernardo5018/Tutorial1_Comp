package com.example.rickandmorty.network

import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.model.Character
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int = 1): Response<CharacterResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}
