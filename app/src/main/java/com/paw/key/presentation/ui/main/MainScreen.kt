package com.paw.key.presentation.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.paw.key.presentation.ui.main.component.MainBottomBar
import kotlinx.collections.immutable.toImmutableList

@Composable
fun MainScreen(
    navigator: MainNavigator = rememberMainNavigator(),
) {
    val snackBarHostState = remember { SnackbarHostState() }

    MainScreenContent(
        navigator = navigator,
        snackBarHostState = snackBarHostState,
    )
}

@Composable
private fun MainScreenContent(
    navigator: MainNavigator,
    snackBarHostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = Modifier
            .background(color = Color.White)
            .windowInsetsPadding(WindowInsets.systemBars.only(WindowInsetsSides.Top))
            .systemBarsPadding()
            .fillMaxSize(),
        content = { padding ->
            Box(modifier = Modifier.fillMaxSize()) {
                PawKeyNavHost(
                    navigator = navigator,
                    paddingValues = padding,
                    snackbarHostState = snackBarHostState,
                    modifier = Modifier.padding(padding)
                )
            }
        },
        bottomBar = {
            MainBottomBar(
                isVisible = navigator.showBottomBar(),
                tabs = MainTab.entries.toImmutableList(),
                currentTab = navigator.currentTab,
                onTabSelected = navigator::navigate
            )
        },
        snackbarHost = {
            SnackbarHost(
                hostState = snackBarHostState
            )
        }
    )
}