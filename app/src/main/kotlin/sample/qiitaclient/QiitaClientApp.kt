package sample.qiitaclient

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import sample.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .build()
    }

}