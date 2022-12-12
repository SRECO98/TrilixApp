package com.example.lolguessquiz.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ScoreModel(
    @PrimaryKey val id: Int? = null,
    val maxScoreGuessChampion: Int? = null,
    val maxScoreGuessPassive: Int? = null,
    val maxScoreGuessChampionFromSpell: Int? = null,
    val maxScoreGuessSpellName: Int? = null,
)
