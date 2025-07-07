package com.saw.expenzo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.saw.expenzo.ui.components.MainScreen
import com.saw.expenzo.ui.theme.ExpenzoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenzoTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExpenzoPreview() {
    ExpenzoTheme {
        MainScreen()
    }
}
