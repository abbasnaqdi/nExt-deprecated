package com.github.oky2abbas.nExt.component.activity

import android.content.Context
import android.content.pm.PackageManager
import android.content.pm.PackageManager.GET_META_DATA
import android.content.res.Configuration
import android.os.Bundle
import androidx.annotation.LayoutRes
import butterknife.ButterKnife
import com.github.oky2abbas.nExt.component.LocaleUtils
import dagger.android.support.DaggerAppCompatActivity


abstract class BaseDaggerActivity : DaggerAppCompatActivity() {

    //Implemented in child classes

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LocaleUtils.setLocale(this)
        resetTitle()
        setContentView(layoutRes())
        viewHandler(savedInstanceState)
        ButterKnife.bind(this)
    }

    // for force RTL layout
    private fun resetTitle() {
        try {
            val label = packageManager.getActivityInfo(
                componentName, GET_META_DATA
            ).labelRes
            if (label != 0) {
                setTitle(label)
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }

    //change language config setting for all activity

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleUtils.setLocale(newBase))
    }

    //change language config setting for all activity

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LocaleUtils.setLocale(this)
    }

    //Implemented in child classes

    abstract fun viewHandler(savedInstanceState: Bundle?)
}