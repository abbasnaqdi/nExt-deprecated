package com.github.oky2abbas.nExt.thirdParty.lifecycle

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/*
    @author : naqqdi@gmail.com
    This is a shortcut to building a ViewModel instance
 */

fun <T : ViewModel> ViewModelProvider.Factory.get(
    activity: FragmentActivity,
    clazz: Class<T>
): T {
    return ViewModelProvider(activity, this).get(clazz)
}

/*
    @author : naqqdi@gmail.com
    This is a shortcut to building a ViewModel instance
 */

fun <T : ViewModel> ViewModelProvider.Factory.get(
    fragment: Fragment,
    clazz: Class<T>
): T {
    return ViewModelProvider(fragment, this).get(clazz)
}