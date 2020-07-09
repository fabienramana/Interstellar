package com.example.interstellar.business.model

data class Movie(
    val title: String,
    val releaseDate: String,
    val pegi: String,
    val duration: String,
    val categories: String,
    val description: String,
    val note: String,
    val numberOfViews: String,
    val metascore: String,
    val numberOfCritics: String
)