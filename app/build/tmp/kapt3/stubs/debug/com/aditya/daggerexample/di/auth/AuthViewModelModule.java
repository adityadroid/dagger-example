package com.aditya.daggerexample.di.auth;

import java.lang.System;

/**
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/aditya/daggerexample/di/auth/AuthViewModelModule;", "", "()V", "bindAuthViewModel", "Landroidx/lifecycle/ViewModel;", "authViewModel", "Lcom/aditya/daggerexample/ui/auth/AuthViewModel;", "app_debug"})
@dagger.Module()
public abstract class AuthViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.aditya.daggerexample.di.ViewModelKey(value = com.aditya.daggerexample.ui.auth.AuthViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAuthViewModel(@org.jetbrains.annotations.NotNull()
    com.aditya.daggerexample.ui.auth.AuthViewModel authViewModel);
    
    public AuthViewModelModule() {
        super();
    }
}