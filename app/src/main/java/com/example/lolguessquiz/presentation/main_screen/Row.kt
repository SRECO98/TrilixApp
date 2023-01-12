package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lolguessquiz.R
import com.example.lolguessquiz.presentation.ui.theme.sunny_spell
import java.time.format.TextStyle

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
            modifier = Modifier.fillMaxSize(),
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                    Text(
                        modifier = modifier.padding(top = 22.dp),
                        text = nameOfQuiz,
                        fontSize = 19.sp,
                        fontFamily = sunny_spell,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        letterSpacing = 3.sp,
                        lineHeight = 20.sp,
                        maxLines = 1,
                    )

                Row (
                    horizontalArrangement = Arrangement.Center,
                ){
                    Text(
                        modifier = Modifier.weight(1f),
                        text = maxResult.toString(),
                        fontSize = 24.sp,
                        color = Color.White,
                        fontFamily = sunny_spell,
                        textAlign = TextAlign.End
                    )

                    Text(
                        modifier = Modifier.weight(1f).padding(top = 12.dp),
                        text = "pts",
                        textAlign = TextAlign.Start,
                        fontSize = 12.sp,
                        color = Color.White,
                        fontFamily = sunny_spell,
                    )
                }

            }
        }
    }
}