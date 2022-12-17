package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampStates())

    init {
        val nameOfChamp = getChampName()
        state.nameOfChamp = nameOfChamp
        state.link = getChampionPicture(nameOfChamp = nameOfChamp)
    }


    //Calling function for getting link for picture of random champ.
    fun getChampionPicture(nameOfChamp: String): String{
        var result = ""
        viewModelScope.launch {
            result = repository.getChampionPicture(nameOfChamp = nameOfChamp)
        }
        return result
    }

    //Calling function for getting random champion.
    fun getChampName(): String{
        var name = ""
        viewModelScope.launch {
            name = repository.getChampionName()
        }
        return name
    }
}