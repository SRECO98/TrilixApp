package com.example.lolguessquiz.domain.repository

import kotlinx.coroutines.flow.Flow

interface QuizRepository {

    suspend fun getScores(): Flow<>
}