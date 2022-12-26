package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampState

@Composable
fun TextFieldsForWord(
    modifier: Modifier = Modifier,
    letters: Int,
    state: GuessTheChampState,
) {

    if(letters <= 6){
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            for (i in 1..letters){
                MineBasicTextField(index = i, state = state)
            }
        }
    }else if(letters % 2 != 0){
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2+1, state = state)
    }else{
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2, state = state)
    }
}

@Composable
fun TwoRowsForBiggerWords(
    letters1: Int,
    letters2: Int,
    state: GuessTheChampState,
){
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters1){
            MineBasicTextField(index = i, state = state)
        }
    }
    Row(
        modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters2){
            MineBasicTextField(index = i, state = state)
        }
    }
}