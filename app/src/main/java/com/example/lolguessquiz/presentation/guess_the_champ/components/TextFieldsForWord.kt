package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldsForWord(
    modifier: Modifier = Modifier,
    letters: Int,
) {

    if(letters <= 6){
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            for (i in 1..letters){
                MineBasicTextField()
            }
        }
    }else if(letters % 2 != 0){
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2+1)
    }else{
        TwoRowsForBiggerWords(letters1 = letters/2, letters2 = letters/2)
    }
}

@Composable
fun TwoRowsForBiggerWords(letters1: Int, letters2: Int){
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters1){
            MineBasicTextField()
        }
    }
    Row(
        modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1 .. letters2){
            MineBasicTextField()
        }
    }
}