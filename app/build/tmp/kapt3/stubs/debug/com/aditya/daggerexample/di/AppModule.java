package com.aditya.daggerexample.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/aditya/daggerexample/di/AppModule;", "", "()V", "provideAppDrawable", "Landroid/graphics/drawable/Drawable;", "application", "Landroid/app/Application;", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "provideRequestOptions", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.aditya.daggerexample.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.bumptech.glide.request.RequestOptions provideRequestOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.graphics.drawable.Drawable provideAppDrawable(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}