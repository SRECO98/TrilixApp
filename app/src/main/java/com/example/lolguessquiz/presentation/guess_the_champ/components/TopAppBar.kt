package com.example.lolguessquiz.presentation.guess_the_champ.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lolguessquiz.R

@Composable
fun TopAppBarGuessChamp(
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
            imageVector = Icons.Rounded.ArrowBack,
            contentDescription = null,
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(28.dp))
        Text(
            modifier = modifier
                .fillMaxHeight()
                .wrapContentHeight(),
            text = stringResource(id = R.string.guess_champ_title),
            fontSize = 22.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            letterSpacing = 4.sp
        )
    }
}