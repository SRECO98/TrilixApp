package com.example.lolguessquiz.presentation.guess_the_champ

data class GuessTheChampStates (
    val link: String = "",
    val nameOfChamp: String = "",
    val currentBestScore: Int = 0,
    val guess: Int = 0, // user can guess 3 times.
)