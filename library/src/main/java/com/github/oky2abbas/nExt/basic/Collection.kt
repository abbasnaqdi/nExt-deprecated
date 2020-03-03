package com.github.oky2abbas.nExt.basic


fun <T> List<T>.printList() {
    this.forEachIndexed { index, t ->
        "$index -> ".logE(t.toString())
    }
}

fun <T> Array<T>.printList() {
    this.forEachIndexed { index, t ->
        "$index -> ".logE(t.toString())
    }
}

fun <K, V> Map<K, V>.printMap() {
    this.forEach {
        "${it.key} -> ${it.value}".logE(this.toString())
    }
}

fun <K, V> HashMap<K, V>.printMap() {
    this.forEach {
        "${it.key} -> ${it.value}".logE(this.toString())
    }
}