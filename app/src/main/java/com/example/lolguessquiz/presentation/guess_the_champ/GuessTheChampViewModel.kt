package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.toUpperCase
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.presentation.game_over.GameOver
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampState())

    init {
        getChampionPicture()
    }

    fun onEvent(event: GuessTheChampEvents){
        when(event){
            is GuessTheChampEvents.CheckResult -> {
                if (event.result.equals(state.nameOfChamp.uppercase(Locale.getDefault()))){
                    updateScoreOnScreen(true)
                    getChampionPicture()
                    state.guess = 3
                }else{
                    state.guess -= 1
                    if(state.guess == 0){
                        updateScoreOnScreen(false)
                    }
                }
            }
        }
    }

    //Calling function for getting link for picture of random champ.
    fun getChampionPicture(){
        viewModelScope.launch() {
            val champion = repository.getChampionName()
            val picture = repository.getChampionPicture(nameOfChamp = champion)
            val lengthOfWord = champion.length
            val userWord = startingWord(champion.length)
            state = state.copy(
                link = picture,
                nameOfChamp = champion,
                lengthOfWord = lengthOfWord,
                userWord = userWord,
                guess = 3,
            )
        }
    }

    fun updateScoreOnScreen(boolean: Boolean){
            if(boolean){
                val score = state.currentScoreInGame + 1
                state = state.copy(
                    currentScoreInGame = score
                )
            }else{
                val score = 0
                state = state.copy(
                    currentScoreInGame = score
                )
            }
    }

    fun startingWord(length: Int): String{
        var word = ""
        for (i in 1..length){
             word += i
        }
        return word
    }
}