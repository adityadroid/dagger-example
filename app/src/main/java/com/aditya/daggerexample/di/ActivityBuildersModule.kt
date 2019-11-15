package com.aditya.daggerexample.di

import com.aditya.daggerexample.di.auth.AuthModule
import com.aditya.daggerexample.di.auth.AuthViewModelModule
import com.aditya.daggerexample.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [
            AuthViewModelModule::class,
            AuthModule::class
        ]
    )
    abstract fun contributesAuthActivity(): AuthActivity

}