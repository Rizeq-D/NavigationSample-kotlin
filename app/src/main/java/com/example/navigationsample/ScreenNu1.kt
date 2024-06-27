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
fun ScreenNu1(navigationToSecondScreen : (String) -> Unit) {
    val name = remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text("You, Write you name down,",
            fontWeight = FontWeight.W900, color = Color.Unspecified)
        Text("And let us start our Navigation journey",
            fontWeight = FontWeight.W900, color = Color.Unspecified)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = name.value, onValueChange = {
            name.value = it
        })

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navigationToSecondScreen(name.value)
        }) {
            Text("Go to the next step")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreeningNu1Preview() {
    NavigationSampleTheme {
        ScreenNu1({})
    }
}