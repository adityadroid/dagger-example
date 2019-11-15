package com.aditya.daggerexample.di.auth

import androidx.lifecycle.ViewModel
import com.aditya.daggerexample.di.ViewModelKey
import com.aditya.daggerexample.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 *
 */
@Module
abstract class AuthViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel):ViewModel
}