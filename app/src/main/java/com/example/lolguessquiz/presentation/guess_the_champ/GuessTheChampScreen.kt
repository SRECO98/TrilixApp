package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.lolguessquiz.presentation.game_over.GameOver
import com.example.lolguessquiz.presentation.guess_the_champ.components.CoilImage
import com.example.lolguessquiz.presentation.guess_the_champ.components.MineTextButton
import com.example.lolguessquiz.presentation.guess_the_champ.components.TextFieldsForWord
import com.example.lolguessquiz.presentation.guess_the_champ.components.TopAppBarGuessChamp
import com.ramcosta.composedestinations.annotation.Destination

@Composable
@Destination
fun GuessTheChampScreen(
    modifier: Modifier = Modifier,
    viewModel: GuessTheChampViewModel = hiltViewModel()
) {
    val state = viewModel.state
    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        GameOver(
            onClose = { showDialog = false },
            state = state
        )
    }

    Scaffold(
        topBar = {
            TopAppBarGuessChamp(modifier = modifier)
        },
        modifier = modifier.padding(8.dp),
    )  {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxWidth()
        )  {

            Text(
                text = state.currentScoreInGame.toString(),
                fontSize = 32.sp,
                modifier = modifier.padding(top = 32.dp),
            )

            Box(
                modifier = modifier.align(Alignment.CenterHorizontally)
            ){
                CoilImage(state = state)
            }

            TextFieldsForWord(
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                letters = state.lengthOfWord,
                state = state,
                viewModel = viewModel,
            )

            MineTextButton(
                modifier = modifier,
                onCLick = {
                    state.correctResult = correctnessOfWord(state.userWord.toString())
                    if(state.correctResult){
                        viewModel.onEvent(GuessTheChampEvents.CheckResult(state.userWord.toString()))
                        //animation for showing game over if state.guess == 0
                        if(state.guess == 0) {
                            showDialog = true//this will be transfered to game over after cxlicking play again
                        }
                    }
                }
            )
        }
    }
}

fun correctnessOfWord(userWord: String): Boolean { //checking did user wrie the result correctly and is there any empty field.
    userWord.forEach {
        if (it.equals(null)){ // we are checking numbers because deafault value for every field are numbers from 1 - lengthOfResult.
            return false
        }
    }
    return true
}