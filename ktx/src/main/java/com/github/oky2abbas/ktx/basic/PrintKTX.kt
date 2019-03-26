package com.github.oky2abbas.ktx.basic

import android.util.Log

fun Any.printError(tag: String = "KTX ERROR LOG ->") {
    Log.e(tag, "$this\n")
}


fun Any.printDebug(tag: String = "KTX DEBUG LOG ->") {
    Log.d(tag, "$this\n")
}


fun Any.printInfo(tag: String = "KTX INFO LOG ->") {
    Log.i(tag, "$this\n")
}

fun Any.printWarn(tag: String = "KTX WARN LOG ->") {
    Log.w(tag, "$this\n")
}

fun <T> MutableList<T>.printList() {
    this.forEachIndexed { index, t ->
        "$index -> ".printInfo(t.toString())
    }
}

fun <T> ArrayList<T>.printList() {
    this.forEachIndexed { index, t ->
        "$index -> ".printInfo(t.toString())
    }
}

fun <K, V> Map<K, V>.printMap() {
    this.forEach {
        "${it.key} -> ${it.value}".printInfo(this.toString())
    }
}

fun <K, V> HashMap<K, V>.printMap() {
    this.forEach {
        "${it.key} -> ${it.value}".printInfo(this.toString())
    }
}