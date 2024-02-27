package com.example.primerparcial_id.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.primerparcial_id.R

@Preview(showBackground = true)
@Composable
fun AjedrezExam() {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)

    ) {
        Column() {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            {Image(
                painter = painterResource(R.drawable.black_rook),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
        }
        Column() {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            {Image(
                painter = painterResource(R.drawable.white_queen),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
        }
        Column() {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            {Image(
                painter = painterResource(R.drawable.black_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            {Image(
                painter = painterResource(R.drawable.white_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
        }

        Column() {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            {Image(
                painter = painterResource(R.drawable.black_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            {Image(
                painter = painterResource(R.drawable.white_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
        }
        Column() {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            {Image(
                painter = painterResource(R.drawable.black_king),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            {Image(
                painter = painterResource(R.drawable.black_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFF69B00B)))
            {Image(
                painter = painterResource(R.drawable.white_pawn),
                contentDescription = "Peon negro"
            )}
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color(0xFFFFE4C4)))
            {Image(
                painter = painterResource(R.drawable.whie_king),
                contentDescription = "Peon negro"
            )}
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Anthony Karpov vs Gary Kasparov",
                modifier = Modifier
                    .padding(vertical = 400.dp)
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Rusia 1993",
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(vertical = 500.dp)

            )

        }
    }
}