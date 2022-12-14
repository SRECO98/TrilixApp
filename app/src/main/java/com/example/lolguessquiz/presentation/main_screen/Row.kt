package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.max

@Composable
fun RowQuiz(
    nameOfQuiz: String,
    modifier: Modifier = Modifier,
    maxResult: Int,
) {
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .height(56.dp)
    ){
        Box(
            modifier = modifier
                .padding(top = 4.dp, bottom = 4.dp)
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
        ){
            Text(
                modifier = modifier
                    .padding(4.dp),
                text = maxResult.toString(),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.Black,
            )
        }
        Spacer(modifier = modifier.width(8.dp))
        Text(
            text = nameOfQuiz,
            modifier = modifier
                .padding(top = 4.dp, bottom = 4.dp),
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = modifier.width(8.dp))
        IconButton(
            modifier = modifier.padding(end = 8.dp),
            onClick = {
                //
            }
        ) {
            Icon(
                imageVector = Icons.Rounded.ArrowForward,
                contentDescription = null,
            )
        }
    }
}