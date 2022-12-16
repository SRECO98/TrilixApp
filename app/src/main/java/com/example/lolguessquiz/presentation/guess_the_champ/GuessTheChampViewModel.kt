package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.util.Resource
import kotlinx.coroutines.launch
import javax.inject.Inject

class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampStates())

    init {
        state.link = getLink()
    }

    //Calling function for getting API link.
    fun getLink(): String{
        var link: String = ""
        viewModelScope.launch {
            link = repository.getChampionPicture()
        }
        return link
    }


}