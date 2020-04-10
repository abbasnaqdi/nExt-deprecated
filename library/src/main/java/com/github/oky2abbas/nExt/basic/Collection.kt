package com.github.oky2abbas.nExt.basic


fun <T> List<T>.logList() {
    this.forEachIndexed { index, t ->
        "$index -> ".logE(t.toString())
    }
}

fun <T> Array<T>.logList() {
    this.forEachIndexed { index, t ->
        "$index -> ".logE(t.toString())
    }
}

fun <K, V> Map<*, *>.logMap() {
    this.forEach {
        "${it.key} -> ${it.value}".logE(this.toString())
    }
}

fun <K, V> HashMap<*, *>.logMap() {
    this.forEach {
        "${it.key} -> ${it.value}".logE(this.toString())
    }
}