package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stats(
    @Json(name = "armor")
    val armor: Int,
    @Json(name = "armorperlevel")
    val armorperlevel: Double,
    @Json(name = "attackdamage")
    val attackdamage: Int,
    @Json(name = "attackdamageperlevel")
    val attackdamageperlevel: Int,
    @Json(name = "attackrange")
    val attackrange: Int,
    @Json(name = "attackspeed")
    val attackspeed: Double,
    @Json(name = "attackspeedperlevel")
    val attackspeedperlevel: Double,
    @Json(name = "crit")
    val crit: Int,
    @Json(name = "critperlevel")
    val critperlevel: Int,
    @Json(name = "hp")
    val hp: Int,
    @Json(name = "hpperlevel")
    val hpperlevel: Int,
    @Json(name = "hpregen")
    val hpregen: Int,
    @Json(name = "hpregenperlevel")
    val hpregenperlevel: Int,
    @Json(name = "movespeed")
    val movespeed: Int,
    @Json(name = "mp")
    val mp: Int,
    @Json(name = "mpperlevel")
    val mpperlevel: Int,
    @Json(name = "mpregen")
    val mpregen: Int,
    @Json(name = "mpregenperlevel")
    val mpregenperlevel: Int,
    @Json(name = "spellblock")
    val spellblock: Int,
    @Json(name = "spellblockperlevel")
    val spellblockperlevel: Double
)