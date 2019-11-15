package com.aditya.daggerexample.di.network.auth

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface AuthApi {
    @GET
    fun fakeMethod(): Call<ResponseBody>
}