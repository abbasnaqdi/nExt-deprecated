package com.github.oky2abbas.nExt.basic

import android.util.Log

fun Any.logV(tag: String = "nExt VERBOSE ->", throwable: Throwable? = null) {
    Log.v(tag, "$this\n", throwable)
}

fun Any.logE(tag: String = "nExt ERROR ->", throwable: Throwable? = null) {
    Log.e(tag, "$this\n", throwable)
}

fun Any.logI(tag: String = "nExt INFO ->", throwable: Throwable? = null) {
    Log.i(tag, "$this\n", throwable)
}

fun Any.logD(tag: String = "nExt DEBUG ->", throwable: Throwable? = null) {
    Log.d(tag, "$this\n", throwable)
}

fun Any.logW(tag: String = "nExt WARN ->", throwable: Throwable? = null) {
    Log.w(tag, "$this\n", throwable)
}

fun Any.logWTF(tag: String = "nExt WTF ->", throwable: Throwable? = null) {
    Log.wtf(tag, "$this\n", throwable)
}
