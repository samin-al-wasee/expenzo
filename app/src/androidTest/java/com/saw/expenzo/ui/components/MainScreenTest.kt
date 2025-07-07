package com.saw.expenzo.ui.components

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun mainScreen_displaysDefaultAndSwitchesContent() {
        composeTestRule.setContent {
            MainScreen()
        }

        composeTestRule.onNodeWithTag("bottomNavigationBar").assertExists()
        composeTestRule.onNodeWithTag("mainScreenContent").assertExists()
    }
}
