package com.example.lolguessquiz.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ScoreModelEntity(
    @PrimaryKey val id: String,
    val score: Int,
)
