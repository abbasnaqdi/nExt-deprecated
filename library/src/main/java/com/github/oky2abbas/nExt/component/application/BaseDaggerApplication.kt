package com.github.oky2abbas.nExt.component.application

import android.content.res.Configuration
import com.github.oky2abbas.nExt.component.LocaleUtils
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseDaggerApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        LocaleUtils.setLocale(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return AndroidInjector { this::class.java }
    }

    //config language for all application
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LocaleUtils.setLocale(this)
    }
}