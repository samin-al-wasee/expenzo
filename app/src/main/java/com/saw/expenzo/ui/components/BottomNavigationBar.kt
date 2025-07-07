package com.saw.expenzo.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigationBar(
    navItems: List<NavItem>,
    selectedItem: NavItem,
    onItemClick: (NavItem) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        navItems.forEach { navItem ->
            NavigationBarItem(
                selected = navItem == selectedItem,
                onClick = { onItemClick(navItem) },
                icon = { Icon(navItem.icon, contentDescription = navItem.label) },
                label = { Text(navItem.label) }
            )
        }
    }
}
