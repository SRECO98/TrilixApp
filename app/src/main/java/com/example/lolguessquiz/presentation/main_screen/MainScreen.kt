package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
    Scaffold(
        topBar = {
            AppTopBar(modifier)
        },
        modifier = modifier.padding(8.dp),
    )  {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            RowQuiz(
                navigator = navigator,
                modifier = modifier,
                nameOfQuiz = stringResource(id = R.string.guess_the_champion),
                maxResult = state.scores?.maxScoreGuessChampion,
            )
            Spacer(modifier = Modifier.height(8.dp))
            RowQuiz(
                navigator = navigator,
                modifier = modifier,
                nameOfQuiz = stringResource(id = R.string.guess_the_passive),
                maxResult = state.scores?.maxScoreGuessPassive,
            )
            Spacer(modifier = Modifier.height(8.dp))
            RowQuiz(
                navigator = navigator,
                modifier = modifier,
                nameOfQuiz = stringResource(id = R.string.guess_the_champ_by_spell),
                maxResult = state.scores?.maxScoreGuessChampionFromSpell,
            )
            Spacer(modifier = Modifier.height(8.dp))
            RowQuiz(
                navigator = navigator,
                modifier = modifier,
                nameOfQuiz = stringResource(id = R.string.guess_the_spell_name),
                maxResult = state.scores?.maxScoreGuessSpellName,
            )
            Spacer(modifier = Modifier.height(16.dp))

            TextButton(
                onClick = {
                    val activity: MainActivity = MainActivity()
                    activity.finish()
                    System.exit(0)
                },
                modifier = modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = ScoreModel.noteColors.random())
                    .border(2.dp, color = Color.Black, RoundedCornerShape(16.dp))
            ) {
                Text(
                    text = stringResource(id = R.string.exit_game),
                    modifier = modifier
                        .padding(4.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color.Black,
                )
            }
        }

    }
}

@Composable
fun AppTopBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .height(56.dp)
    ) {
        Icon(
            modifier = modifier
                .fillMaxHeight()
                .wrapContentHeight()
                .padding(start = 8.dp),
            imageVector = Icons.Rounded.Menu,
            contentDescription = null,
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(110.dp))
        Text(
            modifier = modifier
                .fillMaxHeight()
                .wrapContentHeight(),
            text = stringResource(id = R.string.app_real_name),
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            letterSpacing = 4.sp
        )
    }
}