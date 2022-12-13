package com.example.lolguessquiz.presentation.main_screen

import androidx.lifecycle.ViewModel
import com.example.lolguessquiz.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

}