package com.example.app1

import java.io.Serializable

data class FilmModel(val filmName: String, val filmDirector: String, val filmScore: String?):Serializable {
}