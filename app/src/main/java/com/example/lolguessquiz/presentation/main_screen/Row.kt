package com.example.lolguessquiz.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
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
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .border(2.dp, color = Color.Black, RoundedCornerShape(16.dp))
            .height(80.dp)
            .fillMaxWidth()
    ){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.button2),
            contentDescription = "button_image",
            contentScale = ContentScale.FillBounds
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(start = 16.dp, end = 16.dp)
        ){

            Spacer(modifier = modifier.width(8.dp))

            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxHeight())
            {
                Text(
                    text = nameOfQuiz,
                    modifier = modifier
                        .padding(4.dp)
                        .wrapContentHeight(),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif
                )
            }


            Spacer(modifier = modifier.weight(1f))


            IconButton(
                modifier = modifier.padding(end = 8.dp),
                onClick = onClick,
            ) {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxHeight())
                {
                    Icon(
                        imageVector = Icons.Rounded.ArrowForward,
                        contentDescription = null,
                    )
                }
            }
        }

        Box(
            modifier = modifier
                .padding(top = 47.dp, bottom = 47.dp, start = 16.dp)
                .size(56.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
                .border(2.dp, color = Color.Black, RoundedCornerShape(16.dp))
        ){
            Text(
                modifier = modifier.padding(start = 16.dp, top = 16.dp),
                text = maxResult.toString(),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.Black,
            )
        }
    }

}