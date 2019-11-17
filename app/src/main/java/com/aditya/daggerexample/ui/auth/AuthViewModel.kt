package com.aditya.daggerexample.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.aditya.daggerexample.network.auth.AuthApi
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthViewModel @Inject constructor(authApi: AuthApi) : ViewModel() {
    val value: String = "okay"
    private val TAG = "AuthViewModel"

    init {
        val result = authApi.getUser(1)
            .toObservable()
            .subscribeOn(Schedulers.io())
            .subscribe({ user ->
                Log.d(TAG, "User: ${user.email}")
            }, { onError ->
                Log.e(TAG, "Error: ", onError)
            })

    }
}