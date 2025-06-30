package com.doggy.walker.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DummyBaseResponse<T>(
    @SerialName("data")
    val data: List<T>,
    @SerialName("page")
    val page: Int,
    @SerialName("per_page")
    val perPage: Int,
    @SerialName("support")
    val support: Support,
    @SerialName("total")
    val total: Int,
    @SerialName("total_pages")
    val totalPages: Int
) {
    @Serializable
    data class Support(
        @SerialName("text")
        val text: String,
        @SerialName("url")
        val url: String,
    )
}
