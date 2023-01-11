package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lolguessquiz.R

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