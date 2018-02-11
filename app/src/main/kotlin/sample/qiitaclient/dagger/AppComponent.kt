package sample.qiitaclient.dagger

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import sample.qiitaclient.QiitaClientApp
import javax.inject.Singleton

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ClientModule::class,
    ActivityModule::class
])
@Singleton
interface AppComponent: AndroidInjector<QiitaClientApp> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    override fun inject(qiitaClientApp: QiitaClientApp)
}