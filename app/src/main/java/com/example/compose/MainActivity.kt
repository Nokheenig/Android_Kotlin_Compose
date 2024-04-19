package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background((Color.Green))
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(10f)
                    .padding(top = 16.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(5.dp, Color.Cyan)
                    .padding(5.dp)
                    .border(10.dp, Color.Yellow)
                    .padding(10.dp)
            ) {
                Text(text = "Hello", modifier = Modifier
                    .offset(x=0.dp, y=20.dp)
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
                )
                Spacer(modifier = Modifier
                    .height(50.dp))
                Text(text = "Tom Jedusor")
            }
        }
    }
}
