package com.github.oky2abbas.nExt.crypto

import android.util.Base64

fun String.toBase64(): String {
    return Base64.encodeToString(
        this.toByteArray(Charsets.UTF_8),
        Base64.NO_WRAP
    ).toString()
}

fun String.fromBase64(): String {
    return Base64.decode(this, Base64.NO_WRAP)
        .toString(Charsets.UTF_8)
}
