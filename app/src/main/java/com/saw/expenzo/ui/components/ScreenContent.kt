package com.saw.expenzo.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ScreenContent(
    navItems: List<NavItem>,
    selectedItem: NavItem
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = navItems.find { navItem -> navItem == selectedItem }?.label
                ?: run { "Screen not found" },
            style = MaterialTheme.typography.headlineLarge
        )
    }
}
