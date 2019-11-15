// Generated by Dagger (https://dagger.dev).
package com.aditya.daggerexample.di;

import android.app.Application;
import android.graphics.drawable.Drawable;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAppDrawableFactory implements Factory<Drawable> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvideAppDrawableFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Drawable get() {
    return provideAppDrawable(applicationProvider.get());
  }

  public static AppModule_ProvideAppDrawableFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideAppDrawableFactory(applicationProvider);
  }

  public static Drawable provideAppDrawable(Application application) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideAppDrawable(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}