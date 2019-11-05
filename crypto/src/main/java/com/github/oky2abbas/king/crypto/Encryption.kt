package com.github.oky2abbas.king.crypto

import android.util.Base64

fun String.encodeToBase64(): String {
    return Base64.encodeToString(
        this.toByteArray(Charsets.UTF_8),
        Base64.NO_WRAP
    ).toString()
}

fun String.decodeFromBase64(): String {
    return Base64.decode(this, Base64.NO_WRAP)
        .toString(Charsets.UTF_8)
}
