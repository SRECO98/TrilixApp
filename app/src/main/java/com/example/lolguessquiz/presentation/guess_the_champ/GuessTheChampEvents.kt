package com.example.lolguessquiz.presentation.guess_the_champ

sealed class GuessTheChampEvents {
    data class CheckResult(val result: String): GuessTheChampEvents()
}