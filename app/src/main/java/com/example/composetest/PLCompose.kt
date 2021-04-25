package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.ui.theme.ComposeTestTheme

class PLCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Section1()
        }
    }
}

@Composable
fun Section1() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
//            .padding(top = 50.dp)
            .border(5.dp, Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(15.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
//            .width(600.dp)
//            .requiredWidth(600.dp)
    ) {
        Text(text = "Hello")
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World")
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeTestTheme {
        Section1()
    }
}