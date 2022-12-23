package com.example.lolguessquiz.data.mapper

import com.example.lolguessquiz.data.local.ScoreModelEntity
import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.util.AppNamesOfQuizes

fun ScoreModelEntity.toScoreModel(): ScoreModel{
    return ScoreModel(
        score = score
    )
}

fun ScoreModel.toScoreModelEntity(): ScoreModelEntity{
    return ScoreModelEntity(
        score = score,
        id = AppNamesOfQuizes.quizGuessChamp
    )
}
