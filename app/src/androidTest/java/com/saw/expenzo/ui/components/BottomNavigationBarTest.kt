package com.saw.expenzo.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class BottomNavigationBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val navItems = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Settings", Icons.Default.Settings)
    )

    @Test
    fun bottomNavigation_displaysAllItems_andHandlesClick() {
        var selectedItem by mutableStateOf(navItems[0])

        composeTestRule.setContent {
            BottomNavigationBar(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemClick = { selectedItem = it }
            )
        }

        composeTestRule.onNodeWithText("Home").assertExists()
        composeTestRule.onNodeWithText("Settings").assertExists()

        composeTestRule.onNodeWithText("Settings").performClick()

        assert(selectedItem == navItems[1])
    }
}
