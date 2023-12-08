package com.example.utslabmp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val image: Int,
    val name: String
) : Parcelable
