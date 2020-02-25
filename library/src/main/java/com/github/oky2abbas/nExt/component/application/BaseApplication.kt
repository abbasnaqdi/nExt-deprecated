package com.github.oky2abbas.nExt.component.application

import android.app.Application
import android.content.res.Configuration
import com.github.oky2abbas.nExt.component.LocaleUtils

abstract class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LocaleUtils.setLocale(this)
    }


    //config language for all application
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LocaleUtils.setLocale(this)
    }
}