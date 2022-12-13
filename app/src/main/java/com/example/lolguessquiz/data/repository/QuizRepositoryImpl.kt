package com.example.lolguessquiz.data.repository

import com.example.lolguessquiz.data.local.ScoreDatabase
import com.example.lolguessquiz.data.local.ScoreModelEntity
import com.example.lolguessquiz.data.mapper.toScoreModel
import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(
    private val db: ScoreDatabase,
): QuizRepository {

    private val dao = db.dao

    override suspend fun getScores(): Flow<Resource<ScoreModel>> {
        return flow {
            emit(Resource.Loading(true))
            val localScores = dao.getAllScores()
            emit(Resource.Success(
                data = localScores.toScoreModel()
            ))
            val isDbEmpty = localScores.equals(null)
            val shouldJustLoadFromCache = !isDbEmpty
            if(shouldJustLoadFromCache){
                emit(Resource.Loading(false))
                return@flow
            }
            try {
                dao.updateScores(
                    ScoreModelEntity(
                        maxScoreGuessChampion = 0,
                        maxScoreGuessPassive = 0,
                        maxScoreGuessSpellName = 0,
                        maxScoreGuessChampionFromSpell = 0,
                    )
                )
            }catch (e: IOException){
                e.printStackTrace()
                emit(Resource.Error("Fails to add scores to db."))
            }

            val localScores2 = dao.getAllScores()
            emit(Resource.Success(
                data = localScores2.toScoreModel()
            ))
            emit(Resource.Loading(false))
        }
    }

    override suspend fun updateScore(score: Int): Flow<Resource<Int>> {
        TODO("Not yet implemented")
    }

    override suspend fun getChampionPicture(): Flow<Resource<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun getChampionPassive(): Flow<Resource<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun getChampionSpell(): Flow<Resource<String>> {
        TODO("Not yet implemented")
    }
}