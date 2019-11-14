// Generated by Dagger (https://dagger.dev).
package com.aditya.daggerexample.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_SomeStringFactory implements Factory<String> {
  @Override
  public String get() {
    return someString();
  }

  public static AppModule_SomeStringFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String someString() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.someString(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_SomeStringFactory INSTANCE = new AppModule_SomeStringFactory();
  }
}