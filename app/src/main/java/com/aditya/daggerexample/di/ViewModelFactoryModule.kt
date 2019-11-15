package com.aditya.daggerexample.di

import androidx.lifecycle.ViewModelProvider
import com.aditya.daggerexample.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

/**
 * Provides the ViewModelFactory
 */
@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory

}