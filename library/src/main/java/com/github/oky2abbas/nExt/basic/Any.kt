package com.github.oky2abbas.nExt.basic

import android.util.Log

fun Any.printInfo(tag: String = "nExt INFO LOG ->") {
    Log.i(tag, "$this\n")
}
