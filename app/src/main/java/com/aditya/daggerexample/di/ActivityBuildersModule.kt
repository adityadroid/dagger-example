package com.aditya.daggerexample.di

import com.aditya.daggerexample.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract  class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract  fun contributesAuthActivity(): AuthActivity

}