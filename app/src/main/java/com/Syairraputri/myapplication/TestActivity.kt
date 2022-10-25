package com.Syairraputri.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment


import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Green)
                ) {

                Image(
                    painter = painterResource(id= R.drawable.logo_polban),
                    contentDescription = "Gambar"
                )

                Surface(
                    color = Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Hallo Syairra Putri Aprilliana",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Magenta
                    )
                }

                Surface(
                    color = Cyan,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Semangat kuliahnya!!!",
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp)
                    )
                }
            }
        }
    }
}