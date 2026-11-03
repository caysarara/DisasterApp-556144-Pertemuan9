package com.example.disasterapp

import androidx.annotation.DrawableRes

// model disaster
data class Disaster (
    val nameDisaster: String="",
    val disasterType: String="",
    @DrawableRes val imageDisaster: Int = 0
)