package com.Syairraputri.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class DaduActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceApp()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DiceApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        var daduActivityValue by remember {
            mutableStateOf(1)
        }

        val image = when (daduActivityValue) {
            1 -> R.drawable.dadu
            2 -> R.drawable.dadu
            3 -> R.drawable.dadu
            4 -> R.drawable.dadu
            5 -> R.drawable.dadu
            else -> {
                R.drawable.dadu
            }
        }

        Image(
            painter = painterResource(id = image),
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )
        Button(
            onClick = {
                daduActivityValue = (listOf<Int>(1,6)).random()
            },
            content = {
                Text(text = "Roll")
            }
        )


    }
}