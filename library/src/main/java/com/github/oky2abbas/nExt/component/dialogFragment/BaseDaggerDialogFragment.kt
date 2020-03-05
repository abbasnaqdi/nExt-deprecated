package com.github.oky2abbas.nExt.component.dialogFragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.fragment.app.DialogFragment
import butterknife.ButterKnife
import dagger.android.support.DaggerDialogFragment


abstract class BaseDaggerDialogFragment : DaggerDialogFragment() {

    lateinit var activityContext: AppCompatActivity


    //Implemented in child classes

    @LayoutRes
    abstract fun layoutRes(): Int

    @StyleRes
    abstract fun themeRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, themeRes())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val contextThemeWrapper = ContextThemeWrapper(activity, activity?.theme)
        val view = inflater.cloneInContext(contextThemeWrapper).inflate(
            layoutRes(), container, false
        )
        ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewHandler(view, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityContext = context as AppCompatActivity
    }

    //Implemented in child classes

    abstract fun viewHandler(view: View, savedInstanceState: Bundle?)
}