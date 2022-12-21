package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckLettersInTheWord(
    letters: Int,
) {
    when {

        letters == 2 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
            }
        }

        letters == 3 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
            }
        }

        letters == 4 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
            }
        }

        letters == 5 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
            }
        }

        letters == 6 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
                Spacer(modifier = Modifier.width(8.dp))
                MineBasicTextField()
            }
        }

        letters == 7 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()

                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }

        letters == 8 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }

        letters == 9 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()

                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }

        letters == 10 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }

        letters == 11 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }

        letters == 12 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                    Spacer(modifier = Modifier.width(8.dp))
                    MineBasicTextField()
                }
            }
        }
    }
}