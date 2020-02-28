package com.github.oky2abbas.nExt.builder

import com.google.gson.Gson

object NExt {
    internal lateinit var gSon: Gson
    inline fun build(block: Builder.() -> Unit) =
        Builder().apply(block).build()

    class Builder {
        lateinit var gSon: Gson
        fun build(): NExt {
            NExt.gSon = gSon
            return NExt
        }
    }
}