package com.github.oky2abbas.nExt.builder

import com.google.gson.Gson

object NExt {

    private lateinit var gSon: Gson

    fun builder(): NExt {
        return this
    }

    fun setJson(gSon: Gson): NExt {
        this.gSon = gSon

        return this
    }

    fun getGSon() = gSon

    fun build(): NExt {
        return this
    }
}