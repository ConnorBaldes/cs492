package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation(
    val id: Int,
    @StringRes val name: Int,
    @StringRes val address: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
