package edu.school.rolldice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.school.rolldice.ui.theme.RollDiceTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.ui.input.pointer.pointerInput


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RollDiceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Dice(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun Dice(modifier: Modifier = Modifier) {
    var diceNumber by remember { mutableStateOf(0) }
    val diceImages = listOf(
        R.drawable.dice0,
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    )

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "請點擊圖片隨機丟骰子\n雙擊歸零，長按變成 6 點\n作者：楊子青",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = diceImages[diceNumber]),
            contentDescription = if (diceNumber == 0) "骰子：尚未擲骰" else "骰子：${diceNumber}點",
            modifier = Modifier
                .size(120.dp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = {
                            diceNumber = (1..6).random()
                        },
                        onDoubleTap = {
                            diceNumber = 0
                        },
                        onLongPress = {
                            diceNumber = 6
                        }
                    )
                }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DicePreview() {
    RollDiceTheme {
        Dice()
    }
}
