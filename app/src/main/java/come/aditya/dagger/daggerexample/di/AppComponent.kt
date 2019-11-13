package come.aditya.dagger.daggerexample.di

import android.app.Application
import come.aditya.dagger.daggerexample.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AndroidSupportInjectionModule::class]
)
public interface AppComponent : AndroidInjector<BaseApplication>{
    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}