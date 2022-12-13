package com.example.lolguessquiz.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ScoreDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateScores(
        scores: ScoreModelEntity
    )

    @Query("SELECT * FROM ScoreModelEntity")
    suspend fun getAllScores(): ScoreModelEntity


}