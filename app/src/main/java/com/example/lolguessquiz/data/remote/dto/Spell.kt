package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Spell(
    @Json(name = "cooldown")
    val cooldown: List<Double>,
    @Json(name = "cooldownBurn")
    val cooldownBurn: String,
    @Json(name = "cost")
    val cost: List<Int>,
    @Json(name = "costBurn")
    val costBurn: String,
    @Json(name = "costType")
    val costType: String,
    @Json(name = "datavalues")
    val datavalues: Datavalues,
    @Json(name = "description")
    val description: String,
    @Json(name = "effect")
    val effect: List<List<Int>>,
    @Json(name = "effectBurn")
    val effectBurn: List<String>,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: Image,
    @Json(name = "leveltip")
    val leveltip: Leveltip,
    @Json(name = "maxammo")
    val maxammo: String,
    @Json(name = "maxrank")
    val maxrank: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "range")
    val range: List<Int>,
    @Json(name = "rangeBurn")
    val rangeBurn: String,
    @Json(name = "resource")
    val resource: String,
    @Json(name = "tooltip")
    val tooltip: String,
    @Json(name = "vars")
    val vars: List<Any>
)