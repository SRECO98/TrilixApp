package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Leveltip(
    @Json(name = "effect")
    val effect: List<String>,
    @Json(name = "label")
    val label: List<String>
)