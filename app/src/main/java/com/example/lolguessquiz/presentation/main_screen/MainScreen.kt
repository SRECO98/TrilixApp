package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.lolguessquiz.MainActivity
import com.example.lolguessquiz.R
import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.presentation.destinations.GuessTheChampScreenDestination
import com.example.lolguessquiz.ui.theme.Shapes
import com.example.lolguessquiz.util.AppNamesOfQuizes
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination(start = true)
fun MainScreen(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier,
    viewModel: MainScreenViewModel = hiltViewModel()
) {
    val state = viewModel.state
    
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds
        )

        Scaffold(
            backgroundColor = Color.Transparent,
            modifier = modifier,
        )  {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.padding(top = 280.dp)
            ) {
                RowQuiz(
                    onClick = {
                        viewModel.state.quiz = AppNamesOfQuizes.quizGuessChamp
                        navigator.navigate(
                            GuessTheChampScreenDestination()
                        )
                    },
                    modifier = modifier.padding(start = 24.dp, end = 24.dp).clip(RoundedCornerShape(22.dp)),
                    nameOfQuiz = AppNamesOfQuizes.quizGuessChamp,
                    maxResult = state.scores?.score,
                )
                Spacer(modifier = modifier.height(16.dp))
                RowQuiz(
                    onClick = {
                        viewModel.state.quiz = AppNamesOfQuizes.quizGuessChamp
                        /*navigator.navigate(
                            GuessTheChampScreenDestination()
                        )*/
                    },
                    modifier = modifier.padding(start = 24.dp, end = 24.dp).clip(RoundedCornerShape(22.dp)),
                    nameOfQuiz = AppNamesOfQuizes.quizGuessPassive,
                    maxResult = state.scores?.score,
                )
                Spacer(modifier = modifier.height(16.dp))
                RowQuiz(
                    onClick = {
                        viewModel.state.quiz = AppNamesOfQuizes.quizGuessChamp
                        /*navigator.navigate(
                            GuessTheChampScreenDestination()
                        )*/
                    },
                    modifier = modifier.padding(start = 24.dp, end = 24.dp).clip(RoundedCornerShape(22.dp)),
                    nameOfQuiz = AppNamesOfQuizes.quizGuessChampBySpellPicture,
                    maxResult = state.scores?.score,
                )
                Spacer(modifier = modifier.height(16.dp))
                RowQuiz(
                    onClick = {
                        viewModel.state.quiz = AppNamesOfQuizes.quizGuessChamp
                       /* navigator.navigate(
                            GuessTheChampScreenDestination()
                        )*/
                    },
                    modifier = modifier.padding(start = 24.dp, end = 24.dp).clip(RoundedCornerShape(22.dp)),
                    nameOfQuiz = AppNamesOfQuizes.quizGuessTheSpellName,
                    maxResult = state.scores?.score,
                )
            }
        }
    }
}