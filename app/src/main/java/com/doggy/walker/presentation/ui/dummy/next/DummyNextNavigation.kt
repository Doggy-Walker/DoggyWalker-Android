package com.doggy.walker.presentation.ui.dummy.next

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.doggy.walker.core.navigation.Route
import kotlinx.serialization.Serializable

fun NavController.navigateDummyNext(
    navOptions: NavOptions?
) {
    navigate(DummyNext, navOptions)
}

fun NavGraphBuilder.dummyNextNavGraph(
    paddingValues: PaddingValues,
) {
    composable<DummyNext> {
        DummyNextRoute(
            paddingValues = paddingValues,
        )
    }
}

@Serializable
data object DummyNext : Route