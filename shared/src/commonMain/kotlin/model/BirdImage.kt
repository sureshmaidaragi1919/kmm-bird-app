package model

import kotlinx.serialization.Serializable

@Serializable
data class BirdImage(
        val category: String,
        val path: String? = null,
        val author: String? = null
)