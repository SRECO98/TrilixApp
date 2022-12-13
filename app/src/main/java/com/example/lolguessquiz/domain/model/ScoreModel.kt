package com.example.lolguessquiz.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class ScoreModel(
    val maxScoreGuessChampion: Int? = null,
    val maxScoreGuessPassive: Int? = null,
    val maxScoreGuessChampionFromSpell: Int? = null,
    val maxScoreGuessSpellName: Int? = null,
)