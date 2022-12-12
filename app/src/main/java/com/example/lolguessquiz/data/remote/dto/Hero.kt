package com.example.lolguessquiz.data.remote.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hero(
    @Json(name = "allytips")
    val allytips: List<String>,
    @Json(name = "blurb")
    val blurb: String,
    @Json(name = "enemytips")
    val enemytips: List<String>,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: Image,
    @Json(name = "info")
    val info: Info,
    @Json(name = "key")
    val key: String,
    @Json(name = "lore")
    val lore: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "partype")
    val partype: String,
    @Json(name = "passive")
    val passive: Passive,
    @Json(name = "recommended")
    val recommended: List<Any>,
    @Json(name = "skins")
    val skins: List<Skin>,
    @Json(name = "spells")
    val spells: List<Spell>,
    @Json(name = "stats")
    val stats: Stats,
    @Json(name = "tags")
    val tags: List<String>,
    @Json(name = "title")
    val title: String
)