package io.github.jerrymatera.hngresume.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import io.github.jerrymatera.hngresume.R
import io.github.jerrymatera.hngresume.ui.navigation.Destinations
import io.github.jerrymatera.hngresume.ui.theme.ResumeTheme

@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier
        .fillMaxSize(),
) {
    Surface(
        color = MaterialTheme.colors.background
    ) {
        Box(modifier = modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.profile_large),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth(0.9f)
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                Text(text = "Hi, I'm")
                Text(text = "JerryMatera")
                Text(text = "Mobile Engineer")
                Row(

                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .heightIn(56.dp)
                            .fillMaxWidth(0.4f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(Destinations.About.route)
                                },
                        )
                        Text(text = "About Me")

                    }
                    Row(
                        modifier = Modifier
                            .heightIn(56.dp)
                            .fillMaxWidth(0.4f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(text = "My Work")
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "",
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(Destinations.Work.route)
                                },
                        )
                    }

                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Preview(showSystemUi = true, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    ResumeTheme {
        Home(navController = rememberNavController())
    }
}