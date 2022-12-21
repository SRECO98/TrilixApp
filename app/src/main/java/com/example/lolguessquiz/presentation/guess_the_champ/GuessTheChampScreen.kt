package com.example.lolguessquiz.presentation.guess_the_champ

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.lolguessquiz.R
import com.example.lolguessquiz.presentation.guess_the_champ.components.CheckLettersInTheWord
import com.example.lolguessquiz.presentation.guess_the_champ.components.CoilImage
import com.example.lolguessquiz.presentation.guess_the_champ.components.MineBasicTextField
import com.example.lolguessquiz.presentation.guess_the_champ.components.TopAppBarGuessChamp
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
            TopAppBarGuessChamp(modifier = modifier)
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
            CheckLettersInTheWord(letters = state.lettersInChampionName)
            TextButton(
                modifier = modifier
                    .padding(start = 50.dp, end = 50.dp)
                    .border(
                        width = 2.dp,
                        brush = Brush.verticalGradient(listOf(Color.Black, Color.DarkGray)),
                        shape = RoundedCornerShape(4.dp)
                    ),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),

            ) {
                Text(
                    text = stringResource(id = R.string.next),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                )
            }
        }
    }
}

