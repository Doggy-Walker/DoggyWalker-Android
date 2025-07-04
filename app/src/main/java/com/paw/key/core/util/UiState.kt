package com.paw.key.core.util

sealed class UiState<out T> {
    data object Empty : UiState<Nothing>()

    data object Loading : UiState<Nothing>()

    data class Success<T>(
        val data: T,
    ) : UiState<T>()

    data class Failure(
        val message: String,
    ) : UiState<Nothing>()
}