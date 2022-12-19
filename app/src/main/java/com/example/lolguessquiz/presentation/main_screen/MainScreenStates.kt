package com.example.lolguessquiz.presentation.main_screen

import com.example.lolguessquiz.domain.model.ScoreModel

data class MainScreenStates(
    var scores: ScoreModel? = null,
    var quiz: String = ""
)