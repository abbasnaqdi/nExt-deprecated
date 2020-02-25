package com.github.oky2abbas.nExt.singleton

import com.google.gson.Gson

object SingletonObject {
    lateinit var gSon: Gson


    fun init() {
        gSon = Gson()
    }
}