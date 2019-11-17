package com.aditya.daggerexample.di.auth

import com.aditya.daggerexample.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object AuthModule {

        @Provides
        internal fun providesAuthApi(retrofit: Retrofit):AuthApi{
            return retrofit.create(AuthApi::class.java)
        }
}
