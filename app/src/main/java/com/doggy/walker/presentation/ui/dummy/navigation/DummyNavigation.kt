package com.doggy.walker.presentation.ui.dummy.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.SnackbarHostState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.doggy.walker.core.navigation.Route
import com.doggy.walker.presentation.ui.dummy.DummyRoute
import kotlinx.serialization.Serializable

fun NavController.navigateDummy(
    navOptions: NavOptions?
) {
    navigate(Dummy, navOptions)
}

fun NavGraphBuilder.dummyNavGraph(
    paddingValues: PaddingValues,
    navigateUp: () -> Unit,
    navigateNext: () -> Unit,
    snackBarHostState: SnackbarHostState
) {
    composable<Dummy> {
        DummyRoute(
            paddingValues = paddingValues,
            navigateUp = navigateUp,
            navigateNext = navigateNext,
            snackBarHostState = snackBarHostState
        )
    }
}

@Serializable
data object Dummy : Route