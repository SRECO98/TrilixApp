package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Champion(
    @Json(name = "data")
    val `data`: Data,
    @Json(name = "format")
    val format: String,
    @Json(name = "type")
    val type: String,
    @Json(name = "version")
    val version: String
)