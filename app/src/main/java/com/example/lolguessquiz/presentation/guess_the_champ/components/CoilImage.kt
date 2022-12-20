package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.GrayscaleTransformation
import com.example.lolguessquiz.R
import com.example.lolguessquiz.presentation.guess_the_champ.GuessTheChampStates

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
                placeholder(drawableResId = R.drawable.place_holder1)
                error(R.drawable.error_) //error with connection or with a link.
                crossfade(1000) // transition between pictures
                /*transformations(
                    GrayscaleTransformation()//gray colored picture
                )*/
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