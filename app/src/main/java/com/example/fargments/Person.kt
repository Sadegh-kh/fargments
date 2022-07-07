package com.example.fargments

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person (
    val name :String,
    val lastName:String,
    val age:Int,
    val gender:Boolean
        ):Parcelable