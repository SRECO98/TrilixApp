package com.example.lolguessquiz.presentation.guess_the_champ

data class GuessTheChampState (
    var link: String = "",
    var nameOfChamp: String = "",
    var currentBestScore: Int = 0,
    var currentScoreInGame: Int = 0,
    var guess: Int = 3, // user can guess 3 times.
    var lengthOfWord: Int = 0,
    var correctResult: Boolean = false,
    var userWord: Array<String> = emptyArray(),
    var maxChar: Int = 0,
)