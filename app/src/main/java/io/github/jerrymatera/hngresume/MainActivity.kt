package io.github.jerrymatera.hngresume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.github.jerrymatera.hngresume.ui.navigation.ResumeApp
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

