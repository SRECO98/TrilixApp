package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lolguessquiz.R
import com.example.lolguessquiz.domain.model.ScoreModel
import com.example.lolguessquiz.presentation.destinations.GuessTheChampScreenDestination
import com.example.lolguessquiz.presentation.ui.theme.BackgroundMine
import com.example.lolguessquiz.util.AppNamesOfQuizes
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import javax.sql.StatementEvent
import kotlin.math.max

@Composable
fun RowQuiz(
    nameOfQuiz: String,
    modifier: Modifier = Modifier,
    maxResult: Int? = null,
    onClick: () -> Unit = {},
) {
    Box(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
    ){

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.button),
            contentDescription = "button_image",
            contentScale = ContentScale.FillBounds
        )

        Button(
            modifier = modifier
                .fillMaxWidth(),
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxSize().wrapContentHeight()
            ) {
                    Text(
                        text = nameOfQuiz,
                        modifier = modifier
                            .wrapContentHeight().fillMaxHeight(),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                    )

                    Text(
                        modifier = modifier.padding(start = 16.dp, top = 16.dp).fillMaxHeight(),
                        text = maxResult.toString(),
                        textAlign = TextAlign.End,
                        fontSize = 28.sp,
                        color = Color.White,
                    )
            }
        }
    }
}