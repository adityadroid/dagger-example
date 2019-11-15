package com.aditya.daggerexample.viewmodels;

import java.lang.System;

/**
 * This creates the mapping for ViewModelClass: Provider<ViewModelInstance>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB.\b\u0007\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006\u00a2\u0006\u0002\b\u00070\u0003\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004H\u0016\u00a2\u0006\u0002\u0010\fR-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006\u00a2\u0006\u0002\b\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/aditya/daggerexample/viewmodels/ViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "app_debug"})
public final class ViewModelProviderFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, javax.inject.Provider<androidx.lifecycle.ViewModel>> creators = null;
    private static final java.lang.String TAG = "ViewModelProviderFactor";
    public static final com.aditya.daggerexample.viewmodels.ViewModelProviderFactory.Companion Companion = null;
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    @javax.inject.Inject()
    public ViewModelProviderFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, javax.inject.Provider<androidx.lifecycle.ViewModel>> creators) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/aditya/daggerexample/viewmodels/ViewModelProviderFactory$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}