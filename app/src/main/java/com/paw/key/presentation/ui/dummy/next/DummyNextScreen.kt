package com.paw.key.presentation.ui.dummy.next

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DummyNextRoute(
    paddingValues: PaddingValues
) {
    DummyNextScreen(
        paddingValues = paddingValues
    )
}

@Composable
fun DummyNextScreen(
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier
) {
    Text(
        text = "dummy next",
        modifier = modifier
            .padding(paddingValues),
    )
}

@Preview
@Composable
private fun DummyNextScreenPreview() {
    DummyNextScreen(
        paddingValues = PaddingValues()
    )
}