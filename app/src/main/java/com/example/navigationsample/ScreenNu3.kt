package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigationsample.ui.theme.NavigationSampleTheme

@Composable
fun ScreenNu3(navigateToFirstScreen : () -> Unit) {

    val level = remember { mutableStateOf("") }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text("Wow, you have the guts to come to this level",
            fontWeight = FontWeight.W900, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = level.value, onValueChange = {
            level.value = it
        })

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = navigateToFirstScreen) {
            Text("You have seen enough, you need to go back to the first level, NOW!!!")
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun ScreeningNu3Preview() {
    NavigationSampleTheme {
        ScreenNu3({})
    }
}

























