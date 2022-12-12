package com.example.lolguessquiz.data.remote

import com.example.lolguessquiz.data.remote.dto.Champion
import retrofit2.http.GET
import retrofit2.http.Path

interface ChampionApi {

    @GET(END_POINT_CHAMPION)
    suspend fun getChampionAsset(@Path("champion")championName: String): Champion

    @GET(END_POINT_PASSIVE)
    suspend fun getChampionPassive(@Path("passive")passive: String): Champion

    @GET(END_POINT_SPELL)
    suspend fun getChampionSpell(@Path("champion")spellName: String): Champion



    companion object {
        const val API_KEY = "32313141231312"
        const val BASE_URL = "http://ddragon.leagueoflegends.com/cdn/12.23.1/img/"
        const val END_POINT_CHAMPION = "{champion}.png"
        const val END_POINT_PASSIVE = "{passive}.png"
        const val END_POINT_SPELL = "{spell}.png"
    }



}