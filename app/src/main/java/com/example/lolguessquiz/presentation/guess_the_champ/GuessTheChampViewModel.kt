package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.runtime.*
import androidx.compose.ui.text.toUpperCase
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lolguessquiz.data.remote.ChampionPassive
import com.example.lolguessquiz.data.remote.getCorrectFullName
import com.example.lolguessquiz.data.remote.listOfChampionNames
import com.example.lolguessquiz.domain.repository.QuizRepository
import com.example.lolguessquiz.presentation.game_over.GameOver
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.internal.userAgent
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

@HiltViewModel
class GuessTheChampViewModel @Inject constructor(
    private val repository: QuizRepository
): ViewModel() {

    var state by mutableStateOf(GuessTheChampState())
    //FIX MAXSTRING IN FIELD!!!!
    //FIX MAXSTRING IN FIELD!!!!
    //FIX MAXSTRING IN FIELD!!!!

    init {
        getChampionPicture()
    }

    fun onEvent(event: GuessTheChampEvents){
        when(event){
            is GuessTheChampEvents.CheckResult -> {
                //if(state.maxChar == 0){
                    //getting normal string because function toString returns string in [] and its not same.
                    val string =  buildString { for (s in state.userWord) append(s) }
                    if (string.uppercase().equals(state.nameOfChamp.uppercase(Locale.getDefault()))){
                        updateScoreOnScreen(true)
                        getChampionPicture()
                        state.guess = 3
                    }else{
                        state.guess -= 1
                        if(state.guess == 0){
                            updateScoreOnScreen(false)
                        }
                    }
                    //state.maxChar += 1
                //}
            }
            is GuessTheChampEvents.onTextChange -> {
                val newValue = state.userWord.copyOfRange(0, event.index - 1) + event.newString + state.userWord.copyOfRange(event.index, state.userWord.size)
                state = state.copy(
                    userWord = newValue,
                )
            }
        }
    }

    //Calling function for getting link for picture of random champ.
    fun getChampionPicture(){
        viewModelScope.launch() {
            var champion = repository.getChampionName()
            val picture = repository.getChampionPicture(nameOfChamp = champion)
            state = state.copy(
                link = picture,
                guess = 3,
            )
            champion = correctingNameOfChampion(champion = champion)
            val lengthOfWord = champion.length
            val startingWord: Array<String> = getStartingWord(champion.length)
            state = state.copy(
                userWord = startingWord,
                nameOfChamp = champion,
                lengthOfWord = lengthOfWord,
            )
        }
    }

    fun updateScoreOnScreen(boolean: Boolean){
        if(boolean){
            val score = state.currentScoreInGame + 1
            val st = score
            val st2 = score
            state = state.copy(
                currentScoreInGame = score
            )
            val st22 = state.currentScoreInGame
            val st222 = state.currentScoreInGame
        }else{
            val score = 0
            state = state.copy(
                currentScoreInGame = score
            )
        }
    }

    fun getStartingWord(length: Int): Array<String>{
        val array = Array(length){""}
        return array
    }

    fun correctingNameOfChampion(champion: String): String{
        if(champion == "Chogath" || champion == "DrMundo" || champion == "Kaisa" || champion == "Khazix" || champion == "KogMaw" || champion == "RekSai" || champion == "Velkoz") {
            return getCorrectFullName(champName = champion)
        }
        return champion
    }

}