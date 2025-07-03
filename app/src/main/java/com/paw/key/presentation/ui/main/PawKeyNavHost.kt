package com.paw.key.presentation.ui.main

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.paw.key.presentation.ui.dummy.navigation.dummyNavGraph
import com.paw.key.presentation.ui.dummy.next.dummyNextNavGraph

@Composable
fun PawKeyNavHost (
    navigator: MainNavigator,
    paddingValues: PaddingValues,
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navigator.navController,
        startDestination = navigator.startDestination,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
    ) {
        /*
        * homeGraph(
            paddingValues = paddingValues,
            navigateUp = navigator.navController::navigateUp,
            navigateNext = navigator.navController::navigateToCuration,
            snackbarHostState = snackbarHostState,
            modifier = modifier,
        )
        * */
        dummyNavGraph(
            paddingValues = paddingValues,
            navigateUp = navigator::navigateUp,
            navigateNext = navigator::navigateDummyNext,
            snackBarHostState = snackbarHostState
        )

        dummyNextNavGraph(
            paddingValues = paddingValues
        )
    }
}