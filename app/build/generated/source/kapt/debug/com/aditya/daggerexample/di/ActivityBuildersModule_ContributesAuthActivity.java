package com.aditya.daggerexample.di;

import com.aditya.daggerexample.di.auth.AuthModule;
import com.aditya.daggerexample.di.auth.AuthViewModelModule;
import com.aditya.daggerexample.ui.auth.AuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributesAuthActivity.AuthActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributesAuthActivity {
  private ActivityBuildersModule_ContributesAuthActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AuthActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AuthActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {AuthViewModelModule.class, AuthModule.class})
  public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AuthActivity> {}
  }
}
