package com.example.app2

import java.io.Serializable

data class ValorantModel(
    val nameCharacter: String,
    val detailCharacter: String,
    val imageCharacter: Int
) : Serializable {
}