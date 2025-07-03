package com.paw.key.presentation.ui.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paw.key.core.designsystem.theme.PawKeyTheme
import com.paw.key.core.util.noRippleClickable
import com.paw.key.presentation.ui.main.MainTab
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun MainBottomBar(
    isVisible: Boolean,
    tabs: ImmutableList<MainTab>,
    currentTab: MainTab?,
    onTabSelected: (MainTab) -> Unit,
    modifier: Modifier = Modifier,
) {
    AnimatedVisibility(
        visible = isVisible,
        enter = EnterTransition.None,
        exit = ExitTransition.None,
    ) {
        Surface(
            color = Color.White,
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(horizontal = 5.dp)
                    .selectableGroup(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                tabs.forEach { tab ->
                    MainNavigationBarItem(
                        selected = tab == currentTab,
                        tab = tab,
                        onClick = { onTabSelected(tab) },
                        modifier = Modifier
                            .weight(1f)
                            .padding(vertical = 12.dp),
                    )
                }
            }
        }
    }
}

@Composable
private fun MainNavigationBarItem(
    selected: Boolean,
    tab: MainTab,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    //Todo : 색상 교환예정
    val iconRes = if (selected) tab.selectedIcon else tab.unselectedIcon

    val textColor = if (selected) Color.Black else Color.Gray

    Column(
        modifier = modifier
            .noRippleClickable(onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(iconRes),
            contentDescription = stringResource(tab.contentDescription),
            tint = Color.Unspecified,
            modifier = Modifier.size(24.dp),
        )
        Text(
            text = stringResource(tab.contentDescription),
            style = MaterialTheme.typography.labelSmall
        )
    }
}

@Preview
@Composable
private fun MainBottomBarPreview() {
    PawKeyTheme {
        //Todo : MainTab 생성 후 변경 예정
        var currentTab by remember { mutableStateOf(null) }
        MainBottomBar(
            isVisible = true,
            tabs = MainTab.entries.toImmutableList(),
            currentTab = currentTab,
            onTabSelected = {  }
        )
    }
}