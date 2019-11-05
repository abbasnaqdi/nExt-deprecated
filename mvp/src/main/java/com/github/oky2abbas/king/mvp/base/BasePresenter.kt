package com.github.oky2abbas.king.mvp.base

import java.lang.ref.WeakReference

interface BasePresenter<V, M> {
    val view: WeakReference<V>
    val model: M
    fun destroy()
}