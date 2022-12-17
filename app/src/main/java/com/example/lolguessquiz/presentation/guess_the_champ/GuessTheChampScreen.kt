package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.GrayscaleTransformation
import com.ramcosta.composedestinations.annotation.Destination

@Composable
@Destination
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
            CoilImage(state = state)
        }
    }
}

@Composable
fun CoilImage(state: GuessTheChampStates){
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    ){
        val painter = rememberImagePainter(
            data = state.link,
            builder = {
                placeholder(drawableResId = com.example.lolguessquiz.R.drawable.place_holder1)
                error(com.example.lolguessquiz.R.drawable.error_) //error with connection or with a link.
                crossfade(1000) // transition between pictures
                transformations(
                    GrayscaleTransformation()//gray colored picture
                )
                //to check all functions type here: this. :)
            }
        )
        val painterState = painter.state
        Image(
            painter = painter,
            contentDescription = "Champ image"
        )
        if(painterState is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }
    }
}