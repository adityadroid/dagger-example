package com.aditya.daggerexample.ui.auth

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AuthViewModel @Inject constructor(): ViewModel() {
        val value: String = "okay"
}