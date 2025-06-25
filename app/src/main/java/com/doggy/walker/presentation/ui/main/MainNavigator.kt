package com.doggy.walker.presentation.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.doggy.walker.presentation.ui.dummy.navigation.Dummy
import com.doggy.walker.presentation.ui.dummy.navigation.navigateDummy
import com.doggy.walker.presentation.ui.dummy.next.navigateDummyNext

class MainNavigator (
    val navController: NavHostController
) {
    private val currentDestination : NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val startDestination = Dummy

    val currentTab : MainTab?
        @Composable get() = MainTab.find { tab ->
            currentDestination?.hasRoute(tab::class) == true
        }

    fun navigate(tab: MainTab) {
        val navOptions = navOptions {
            navController.currentDestination?.route?.let {
                popUpTo(it) {
                    inclusive = true
                    saveState = true
                }
            }
            launchSingleTop = true
            restoreState = true
        }

        when (tab) {
           /* MainTab.HOME -> navController.navigateToHome(navOptions)
            MainTab.ACCOUNT -> navController.navigateToAccount(navOptions)*/
            else -> {}
        }
    }

    // 더미용 Todo : 나중에 위에거로 교환예정
    fun navigateToDummy(navOptions: NavOptions? = null) {
        navController.navigateDummy(navOptions = navOptions)
    }

    fun navigateDummyNext(navOptions: NavOptions? = null) {
        navController.navigateDummyNext(navOptions = navOptions)
    }

    fun navigateUp() {
        navController.navigateUp()
    }

    @Composable
    fun showBottomBar() = MainTab.contains {
        currentDestination?.hasRoute(it::class) == true
    }
}

@Composable
fun rememberMainNavigator(
    navController: NavHostController = rememberNavController(),
): MainNavigator = remember(navController) {
    MainNavigator(navController)
}
