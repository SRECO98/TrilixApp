package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampEvents
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampState
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampViewModel

@Composable
fun TextFieldsForWord(
    letters: Int,
    state: GuessTheChampState,
    viewModel: GuessTheChampViewModel,
) {
    //focus from field to field
    val focusManager = LocalFocusManager.current
    for (i in 0 until state.lengthOfWord){
        LaunchedEffect(
            key1 = state.userWord[i]
        ){
            if (state.userWord[i].isNotEmpty()) {
                focusManager.moveFocus(
                    focusDirection = FocusDirection.Next,
                )
            }
        }
    }

    if(letters <= 6){
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            for (i in 1..letters){
                MineBasicTextField(value = state.userWord.get(index = i - 1), onValueChanged ={ viewModel.onEvent(GuessTheChampEvents.onTextChange(it, index = i)) })
            }
        }
    }else if(letters % 2 != 0){
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2+1, state = state, viewModel = viewModel)
    }else{
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2, state = state, viewModel = viewModel)
    }
}

@Composable
fun TwoRowsForBiggerWords(
    letters1: Int,
    letters2: Int,
    state: GuessTheChampState,
    viewModel: GuessTheChampViewModel,
){
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters1){
            MineBasicTextField(value = state.userWord.get(index = i - 1), onValueChanged ={ viewModel.onEvent(GuessTheChampEvents.onTextChange(it, index = i)) })
        }
    }
    Row(
        modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters2){
            MineBasicTextField(value = state.userWord.get(index = i - 1), onValueChanged ={ viewModel.onEvent(GuessTheChampEvents.onTextChange(it, index = i)) })
        }
    }
}