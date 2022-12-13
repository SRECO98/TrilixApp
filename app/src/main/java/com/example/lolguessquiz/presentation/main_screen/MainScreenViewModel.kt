package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(MainScreenStates())

    init {
        viewModelScope.launch {
            repository
                .getScores()
                .collect{it ->
                when(it){
                    is Resource.Success -> {
                        it.data?.let{scores ->
                            state.scores = scores.copy()
                        }
                    }
                    is Resource.Error -> Unit
                    is Resource.Loading -> Unit
                }
            }
        }
    }
}