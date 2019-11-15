package com.aditya.daggerexample.di.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/aditya/daggerexample/di/auth/AuthModule;", "", "()V", "providesAuthApi", "Lcom/aditya/daggerexample/di/network/auth/AuthApi;", "retrofit", "Lretrofit2/Retrofit;", "providesAuthApi$app_debug", "app_debug"})
@dagger.Module()
public final class AuthModule {
    public static final com.aditya.daggerexample.di.auth.AuthModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.aditya.daggerexample.di.network.auth.AuthApi providesAuthApi$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private AuthModule() {
        super();
    }
}