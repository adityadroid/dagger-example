package com.aditya.daggerexample.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule{
    @Provides
    fun someString():String{
        return "Hey"
    }
}