package com.example.lolguessquiz.presentation.guess_the_champ

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            modifier = modifier.fillMaxWidth()
        )  {
            Box(
                modifier = modifier.align(Alignment.CenterHorizontally)
            ){
                CoilImage(state = state)
            }

            Spacer(modifier = modifier.height(16.dp))

            Row(
                modifier = modifier
            ) {
                var text by remember { mutableStateOf("") }
                val maxChars = 1

                BasicTextField(
                    value = text,
                    modifier = modifier
                        .border(
                        width = 2.dp,
                        brush = Brush.verticalGradient(listOf(Color.Black, Color.DarkGray)),
                        shape = RoundedCornerShape(4.dp)
                    )
                        .height(54.dp)
                        .background(Color.Transparent)
                        .width(38.dp)
                        .padding(4.dp)
                        .shadow(2.dp),
                    onValueChange = {
                        if(it.length <= maxChars){
                            text = it
                        }
                    },
                    textStyle = TextStyle(color = Color.Black, fontSize = 24.sp, textAlign = TextAlign.Center),
                    maxLines = 1,
                    keyboardOptions = KeyboardOptions(imeAction = androidx.compose.ui.text.input.ImeAction.Next)
                )
            }
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