package com.example.lolguessquiz.data.mapper

import com.example.lolguessquiz.data.local.ScoreModelEntity
import com.example.lolguessquiz.domain.model.ScoreModel

fun ScoreModelEntity.toScoreModel(): ScoreModel{
    return ScoreModel(
        maxScoreGuessChampion = maxScoreGuessChampion,
        maxScoreGuessPassive = maxScoreGuessPassive,
        maxScoreGuessSpellName = maxScoreGuessSpellName,
        maxScoreGuessChampionFromSpell = maxScoreGuessChampionFromSpell,
    )
}

fun ScoreModel.toScoreModelEntity(): ScoreModelEntity{
    return ScoreModelEntity(
        maxScoreGuessChampion = maxScoreGuessChampion,
        maxScoreGuessPassive = maxScoreGuessPassive,
        maxScoreGuessSpellName = maxScoreGuessSpellName,
        maxScoreGuessChampionFromSpell = maxScoreGuessChampionFromSpell,
    )
}