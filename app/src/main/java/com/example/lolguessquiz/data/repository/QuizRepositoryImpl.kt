package com.example.lolguessquiz.data.repository

import com.example.lolguessquiz.data.local.ScoreDao
import com.example.lolguessquiz.data.local.ScoreModelEntity
import com.example.lolguessquiz.data.mapper.toScoreModel
import com.example.lolguessquiz.data.remote.ChampionData
import com.example.lolguessquiz.data.remote.LettersInNameOfChampion
import com.example.lolguessquiz.data.remote.listOfChampionNames
import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(
    private val dao: ScoreDao,
): QuizRepository {

    override suspend fun getScores(): Flow<Resource<ScoreModel>> {
        return flow {
            val localScores: ScoreModelEntity? = dao.getAllScores()
            val isDbEmpty = localScores == null
            if(!isDbEmpty) {
                emit(Resource.Success(
                    data = localScores?.toScoreModel()
                ))
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
                data = localScores2?.toScoreModel()
            ))
        }
    }

    override suspend fun updateScore(score: Int): Flow<Resource<Int>> {
        TODO("Not yet implemented")
    }

    override suspend fun getChampionPicture(nameOfChamp: String): String{
        return ChampionData(nameOfChampion = nameOfChamp)
    }

    override suspend fun getChampionName(): String {
        return listOfChampionNames.random()
    }

    override suspend fun getLettersFromChampion(champion: String): Int {
        return LettersInNameOfChampion(champion = champion)
    }

    override suspend fun getChampionPassive(): Flow<Resource<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun getChampionSpell(): Flow<Resource<String>> {
        TODO("Not yet implemented")
    }
}