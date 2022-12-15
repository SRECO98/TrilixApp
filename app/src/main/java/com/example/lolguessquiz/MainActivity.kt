package com.example.lolguessquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.lolguessquiz.presentation.main_screen.NavGraphs
import com.example.lolguessquiz.ui.theme.BackgroundMine
import com.example.lolguessquiz.ui.theme.LoLGuessQuizTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoLGuessQuizTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundMine
                ) {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }
}