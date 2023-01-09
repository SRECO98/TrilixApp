package com.example.lolguessquiz.presentation.guess_the_champ

sealed class GuessTheChampEvents {
    data class CheckResult(val result: String): GuessTheChampEvents()
    data class updateWord(val char: Char, val index: Int) : GuessTheChampEvents()
    data class onTextChange(val newString: String, val index: Int) : GuessTheChampEvents()
}