package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Passive(
    @Json(name = "description")
    val description: String,
    @Json(name = "image")
    val image: Image,
    @Json(name = "name")
    val name: String
)