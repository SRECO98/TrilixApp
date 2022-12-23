package com.example.lolguessquiz.domain.model

import com.example.lolguessquiz.presentation.ui.theme.*

data class ScoreModel(
    val score: Int
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}