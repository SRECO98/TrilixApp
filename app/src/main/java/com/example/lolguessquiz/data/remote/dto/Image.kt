package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    @Json(name = "full")
    val full: String,
    @Json(name = "group")
    val group: String,
    @Json(name = "h")
    val h: Int,
    @Json(name = "sprite")
    val sprite: String,
    @Json(name = "w")
    val w: Int,
    @Json(name = "x")
    val x: Int,
    @Json(name = "y")
    val y: Int
)