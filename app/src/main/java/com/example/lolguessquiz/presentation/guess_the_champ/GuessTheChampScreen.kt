package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.BoxScopeInstance.matchParentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import dev.chrisbanes.accompanist.picasso.PicassoImage

@Composable
fun GuessTheChampScreen(
    modifier: Modifier = Modifier,
    viewModel: GuessTheChampViewModel = hiltViewModel()
) {
    val state = viewModel.state

    Scaffold(
        topBar = {

        },
        modifier = modifier.padding(8.dp),
    )  {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        )  {
            PicassoImage(
                data = state.link,
                contentDescription = "link",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
                fadeIn = true,
            ) {
                
            }
        }
    }
}