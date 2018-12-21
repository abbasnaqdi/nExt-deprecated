package com.github.dfmabbas.ktx.view

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.showKeyboard() {
    this.requestFocus()
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
    inputMethodManager
        .toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

fun View.hideKeyboard() {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
    inputMethodManager
        .hideSoftInputFromWindow(windowToken, 0)
}

fun View.toShow() {
    this.visibility = View.VISIBLE
}

fun View.toHide() {
    this.visibility = View.GONE
}

fun View.toggleVisibility() {
    if (this.visibility == View.VISIBLE)
        this.toHide()
    else this.toShow()
}