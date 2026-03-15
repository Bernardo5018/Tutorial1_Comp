package com.example.rickandmorty.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterResponse(
    @SerializedName("info") val info: Info,
    @SerializedName("results") val results: List<Character>
)

data class Info(
    @SerializedName("count") val count: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("prev") val prev: String?
)

data class Character(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("type") val type: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("origin") val origin: LocationData,
    @SerializedName("location") val location: LocationData,
    @SerializedName("image") val image: String,
    @SerializedName("episode") val episode: List<String>,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String
) : Serializable

data class LocationData(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) : Serializable
