package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lolguessquiz.R

@Composable
fun MineTextButton(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit,
) {

    TextButton(
        modifier = modifier
            .padding(start = 50.dp, end = 50.dp)
            .border(
                width = 2.dp,
                brush = Brush.verticalGradient(listOf(Color.Black, Color.DarkGray)),
                shape = RoundedCornerShape(4.dp)
            ),
        onClick = onCLick,
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