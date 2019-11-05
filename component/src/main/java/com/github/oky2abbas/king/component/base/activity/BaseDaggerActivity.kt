package com.github.oky2abbas.king.component.base.activity

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.annotation.LayoutRes
import com.github.oky2abbas.king.core.utils.LocaleUtils
import dagger.android.support.DaggerAppCompatActivity


abstract class BaseDaggerActivity : DaggerAppCompatActivity() {

    abstract fun language(): String

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
        viewHandler(savedInstanceState)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleUtils.setNewLocale(newBase, language()))
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LocaleUtils.setNewLocale(this, language())
    }

    abstract fun viewHandler(savedInstanceState: Bundle?)
}