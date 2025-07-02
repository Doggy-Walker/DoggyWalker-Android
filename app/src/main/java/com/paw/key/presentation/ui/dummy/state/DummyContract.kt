package com.paw.key.presentation.ui.dummy.state

import androidx.compose.runtime.Immutable
import com.paw.key.core.util.UiState
import com.paw.key.domain.model.entity.DummyUser
import kotlinx.collections.immutable.PersistentList

class DummyContract {
    @Immutable
    data class DummyState(
        val uiState: UiState<PersistentList<DummyUser>> = UiState.Loading
    )

    sealed class DummySideEffect {
        data class ShowSnackBar(val message: String) : DummySideEffect()
        data object NavigateUp: DummySideEffect()
        data object NavigateNext: DummySideEffect()
    }
}