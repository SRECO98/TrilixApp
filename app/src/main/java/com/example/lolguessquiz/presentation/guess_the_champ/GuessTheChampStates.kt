package com.example.lolguessquiz.presentation.guess_the_champ

data class GuessTheChampStates (
    var link: String = "",
    var nameOfChamp: String = "",
    var currentBestScore: Int = 0,
    var guess: Int = 0, // user can guess 3 times.
    var lettersInChampionName: Int = 0,
)