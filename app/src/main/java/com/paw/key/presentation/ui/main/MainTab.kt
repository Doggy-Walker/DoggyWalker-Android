package com.paw.key.presentation.ui.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.paw.key.core.navigation.MainTabRoute
import com.paw.key.core.navigation.Route

enum class MainTab(
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
    @StringRes val contentDescription: Int,
    val route: MainTabRoute,
) {
    ;
    /*HOME(
        selectedIcon = R.drawable.baseline_home_filled_24,
        unselectedIcon = R.drawable.baseline_home_filled_24,
        contentDescription = R.string.home,
        route = Home,
    ),

    SEARCH(
        selectedIcon = R.drawable.baseline_search_24,
        unselectedIcon = R.drawable.baseline_search_24,
        contentDescription = R.string.search,
        route = Search,
    ),

    COUPON(
        selectedIcon = R.drawable.coupon_icon,
        unselectedIcon = R.drawable.coupon_icon,
        contentDescription = R.string.coupon,
        route = Coupon,
    ),

    SCRAP(
        selectedIcon = R.drawable.baseline_star_24,
        unselectedIcon = R.drawable.baseline_star_24,
        contentDescription = R.string.scrap,
        route = Scrap,
    ),

    ACCOUNT(
        selectedIcon = R.drawable.account_icon,
        unselectedIcon = R.drawable.account_icon,
        contentDescription = R.string.account,
        route = Account,
    );*/

    companion object {
        @Composable
        fun find(predicate: @Composable (MainTabRoute) -> Boolean): MainTab? {
            return entries.find { predicate(it.route) }
        }

        @Composable
        fun contains(predicate: @Composable (Route) -> Boolean): Boolean {
            return entries.map { it.route }.any { predicate(it) }
        }
    }
}