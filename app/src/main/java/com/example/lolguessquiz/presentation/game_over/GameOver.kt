package com.example.lolguessquiz.presentation.game_over

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampState

@Composable
fun GameOver(
    onClose: () -> Unit,
    state: GuessTheChampState,
) {
    AlertDialog(
        onDismissRequest = onClose,
        title = {
            Text(text = "Game status")
        },
        text = {
            Text(
                text = "Game over!"
            )
            Text(
                text = "You got ${state.currentScoreInGame} points!"
            )
        },
        buttons = {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Center
            ){
                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = onClose
                ) {
                    Text("Ok")
                }

                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = onClose
                ) {
                    Text("Play again")
                }
            }
        }
    )
}