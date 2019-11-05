package com.github.oky2abbas.king.component.base.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import dagger.android.support.DaggerFragment


abstract class BaseDaggerFragment : DaggerFragment() {

    lateinit var activityContext: AppCompatActivity

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(
            layoutRes(), container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewHandler(view, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityContext = context as AppCompatActivity
    }

    abstract fun viewHandler(view: View, savedInstanceState: Bundle?)
}