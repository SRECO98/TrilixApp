package com.example.lolguessquiz.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.lolguessquiz.ui.theme.*

data class ScoreModel(
    val maxScoreGuessChampion: Int? = null,
    val maxScoreGuessPassive: Int? = null,
    val maxScoreGuessChampionFromSpell: Int? = null,
    val maxScoreGuessSpellName: Int? = null,
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}