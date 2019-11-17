package com.aditya.daggerexample.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @Expose @SerializedName("id") val id: Int,
    @Expose @SerializedName("username") val username: String,
    @Expose @SerializedName("email") val email: String,
    @Expose @SerializedName("website") val website: String
)