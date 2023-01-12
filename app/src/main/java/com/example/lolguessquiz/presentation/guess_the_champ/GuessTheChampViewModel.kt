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
            }
            //updating value of state for text field.
            is GuessTheChampEvents.onTextChange -> {
                if((state.maxChar[event.index - 1].toInt() + 1) > 1 && event.newString != ""){
                    return
                }
                val newValue = state.userWord.copyOfRange(0, event.index - 1) + event.newString + state.userWord.copyOfRange(event.index, state.userWord.size)
                var newCharValue: Array<String> = emptyArray()
                if(newValue[event.index - 1].equals("")){
                    newCharValue = state.maxChar.copyOfRange(0, event.index - 1) + "0" + state.maxChar.copyOfRange(event.index, state.maxChar.size)
                }else{
                    newCharValue = state.maxChar.copyOfRange(0, event.index - 1) + "1" + state.maxChar.copyOfRange(event.index, state.maxChar.size)
                }
                state = state.copy(
                    userWord = newValue,
                    maxChar = newCharValue,
                )
            }
            ////////////////////////////////////////////
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
            val maxChars = getStartingMaxChars(champion.length)
            state = state.copy(
                userWord = startingWord,
                maxChar = maxChars,
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
    fun getStartingMaxChars(length: Int): Array<String>{
        val array = Array(length){"0"}
        return array
    }

    fun correctingNameOfChampion(champion: String): String{
        if(champion == "Chogath" || champion == "DrMundo" || champion == "Kaisa" || champion == "Khazix" || champion == "KogMaw" || champion == "RekSai" || champion == "Velkoz") {
            return getCorrectFullName(champName = champion)
        }
        return champion
    }

}