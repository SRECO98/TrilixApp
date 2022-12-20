package com.example.lolguessquiz.domain.repository

import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.util.Resource
import kotlinx.coroutines.flow.Flow

interface QuizRepository {

    suspend fun getScores(): Flow<Resource<ScoreModel>>
    suspend fun updateScore(score: Int): Flow<Resource<Int>>
    suspend fun getChampionPicture(nameOfChamp: String): String
    suspend fun getChampionPassive(): Flow<Resource<String>>
    suspend fun getChampionSpell(): Flow<Resource<String>>
    suspend fun getChampionName(): String
    suspend fun getLettersFromChampion(champion: String): Int
}