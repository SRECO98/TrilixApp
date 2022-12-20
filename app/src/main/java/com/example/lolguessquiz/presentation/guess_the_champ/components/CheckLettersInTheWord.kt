package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable

@Composable
fun CheckLettersInTheWord(
    letters: Int,
) {
    when {

        letters <= 6 -> {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                MineBasicTextField()
                MineBasicTextField()
                MineBasicTextField()
                MineBasicTextField()
                MineBasicTextField()
                MineBasicTextField()
            }
        }

        letters == 7 -> {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()

                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
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
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
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
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()

                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
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
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
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
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
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
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()

                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                    MineBasicTextField()
                }
            }
        }

    }
}