package com.saw.expenzo.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag

data class NavItem(
    val label: String,
    val icon: ImageVector
)

val navItems = listOf(
    NavItem("Home", Icons.Default.Home),
    NavItem("Settings", Icons.Default.Settings)
)

@Composable
fun MainScreen() {
    var selectedItem by remember { mutableStateOf(navItems[0]) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemClick = { selectedItem = it },
                modifier = Modifier.testTag("bottomNavigationBar")
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier.Companion
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            ScreenContent(navItems, selectedItem, modifier = Modifier.testTag("mainScreenContent"))
        }
    }

}