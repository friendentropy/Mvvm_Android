package com.yegon.mvvm_morning.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yegon.mvvm_morning.R
import com.yegon.mvvm_morning.navigation.ROUTE_LOGIN
import com.yegon.mvvm_morning.navigation.ROUTE_REGISTRATION

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img3),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "WELCOME TO",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 40.sp
            )
            Text(
                text = "OUR APP",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 40.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Fresh food for everyone",
                color = Color.White,
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                modifier = Modifier.padding(vertical = 26.dp),
                color = Color.White,
                fontFamily = FontFamily.Serif,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
            ) {
                Text(text = "Sign in")
            }
            TextButton(
                onClick = { navController.navigate(ROUTE_REGISTRATION) },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Create an account",
                    color = Color.White
                )
            }
        }
    }
}
@Preview
@Composable
private fun Homeprev() {
    HomeScreen(navController = rememberNavController())
}