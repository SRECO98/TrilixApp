package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Info(
    @Json(name = "attack")
    val attack: Int,
    @Json(name = "defense")
    val defense: Int,
    @Json(name = "difficulty")
    val difficulty: Int,
    @Json(name = "magic")
    val magic: Int
)