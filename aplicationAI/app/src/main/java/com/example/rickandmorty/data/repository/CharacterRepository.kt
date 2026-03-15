package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.model.Character
import com.example.rickandmorty.network.RetrofitInstance
import retrofit2.Response

class CharacterRepository {
    suspend fun getCharacters(page: Int): Response<CharacterResponse> {
        return RetrofitInstance.api.getCharacters(page)
    }

    suspend fun getCharacter(id: Int): Response<Character> {
        return RetrofitInstance.api.getCharacter(id)
    }
}
