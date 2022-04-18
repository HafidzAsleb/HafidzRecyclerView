package com.hafidz.hafidzrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sepatu(
    val imgSepatu: Int,
    val nameSepatu: String,
    var descSepatu: String
) :Parcelable
