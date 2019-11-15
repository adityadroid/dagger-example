package com.aditya.daggerexample.ui.auth

import androidx.lifecycle.ViewModel
import com.aditya.daggerexample.di.network.auth.AuthApi
import javax.inject.Inject

class AuthViewModel @Inject constructor(authApi: AuthApi): ViewModel() {
        val value: String = "okay"
}