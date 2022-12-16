package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.lolguessquiz.domain.repository.QuizRepository
import javax.inject.Inject

class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampStates())

    init {

    }
}