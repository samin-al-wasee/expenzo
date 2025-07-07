package com.saw.expenzo.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class ScreenContentTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val navItems = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Settings", Icons.Default.Settings)
    )

    @Test
    fun screenContent_displaysSelectedItemLabel() {
        composeTestRule.setContent {
            ScreenContent(
                navItems = navItems,
                selectedItem = navItems[1] // Settings
            )
        }

        composeTestRule.onNodeWithText("Settings").assertIsDisplayed()
    }

    @Test
    fun screenContent_displaysFallbackWhenItemNotInList() {
        val invalidItem = NavItem("Invalid", Icons.Default.Settings)

        composeTestRule.setContent {
            ScreenContent(
                navItems = navItems,
                selectedItem = invalidItem
            )
        }

        composeTestRule.onNodeWithText("Screen not found").assertIsDisplayed()
    }
}
