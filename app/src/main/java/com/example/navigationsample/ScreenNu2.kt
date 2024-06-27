package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationsample.ui.theme.NavigationSampleTheme

@Composable
fun ScreenNu2(name : String, navigationToThirdScreen : (String) -> Unit) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text("Hellcome $name",
            fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Text("Now we are in the second level, STAY SHOCKED!!!",
            fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navigationToThirdScreen(name)
        }) {
            Text("MOVE ON!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreeningNu2Previews() {
    NavigationSampleTheme {
        ScreenNu2("", {})
    }
}