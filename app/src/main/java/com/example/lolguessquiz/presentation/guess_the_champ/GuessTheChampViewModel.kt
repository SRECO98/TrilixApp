package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampState())

    init {
        getChampionPicture()
    }


    //Calling function for getting link for picture of random champ.
    fun getChampionPicture(){
        viewModelScope.launch() {
            val champion = repository.getChampionName()
            val picture = repository.getChampionPicture(nameOfChamp = champion)
            state.nameOfChamp = champion
            state.link = picture
            state.lengthOfWord = champion.length
        }
    }
}