package com.example.lolguessquiz.presentation.guess_the_champ.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("SuspiciousIndentation")
@Composable
fun MineBasicTextField(
    modifier: Modifier = Modifier.padding(start = 8.dp, end = 8.dp),
    value: String,
    onValueChanged: (String) -> Unit
) {
    BasicTextField(
        value = value,
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
        onValueChange = onValueChanged,
        textStyle = TextStyle(color = Color.Black, fontSize = 28.sp, textAlign = TextAlign.Center),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next,
            capitalization = KeyboardCapitalization.Sentences
        ),
    )
}