package com.example.lolguessquiz.domain.repository

import com.example.lolguessquiz.data.local.ScoreModelEntity
import com.example.lolguessquiz.util.Resource
import kotlinx.coroutines.flow.Flow

interface QuizRepository {

    suspend fun getScores(): Flow<Resource<ScoreModelEntity>>
}