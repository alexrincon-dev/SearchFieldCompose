package dev.alexrincon.testglobant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.alexrincon.testglobant.core.ui.theme.TestGlobantTheme
import dev.alexrincon.testglobant.ui.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestGlobantTheme {
                SearchScreen()
            }
        }
    }
}
