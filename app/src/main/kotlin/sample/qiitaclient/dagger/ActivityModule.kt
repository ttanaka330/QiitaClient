package sample.qiitaclient.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sample.qiitaclient.MainActivity

@Module
interface ActivityModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

}