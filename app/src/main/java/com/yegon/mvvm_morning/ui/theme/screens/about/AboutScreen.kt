package com.yegon.mvvm_morning.ui.theme.screens.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yegon.mvvm_morning.navigation.ROUTE_HOME

@Composable
fun About(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .fillMaxSize()
    )
    {
        Text(text = "This is About Us Page",
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 40.sp)
        Text(text = "Welcome",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
                navController.navigate(ROUTE_HOME)
        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Home")
        }
    }

}
@Preview
@Composable
private fun Homeprev() {
    About(navController = rememberNavController())
}