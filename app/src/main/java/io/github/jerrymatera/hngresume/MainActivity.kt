package io.github.jerrymatera.hngresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.jerrymatera.hngresume.ui.theme.HNGResumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HNGResumeTheme {
                ResumeApp()
            }
        }
    }
}


@Composable
fun ResumeApp() {
    Scaffold {
        Resume()
    }
}

@Composable
fun Resume(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProfileImage(modifier = modifier.align(Alignment.CenterHorizontally))
        ResumeDetail()
    }
}

@Composable
fun ResumeDetail(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "Okoth Jerry Onyango",
            fontFamily = FontFamily.Default,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = "Android Engineer",
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp

        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .padding(16.dp, 8.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.github),
                contentDescription = "Github",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        context.startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://github.com/JerryMatera")
                            )
                        )
                    },
                tint = Color.Unspecified
            )
            Icon(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = "linkedIn",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        context.startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.linkedin.com/in/jerryonyango/")
                            )
                        )
                    },
                tint = Color.Unspecified
            )
            Icon(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        context.startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://twitter.com/jerryMatera")
                            )
                        )
                    },
                tint = Color.Unspecified
            )
        }
        Text(
            text = "Bio",
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.Start)
        )
        Text(
            text = stringResource(R.string.bio_description),
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp
        )
    }

}


@Composable
fun ProfileImage(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colors.background,
        elevation = 8.dp,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResumeApp2Preview() {
    HNGResumeTheme {
        ResumeApp()
    }
}