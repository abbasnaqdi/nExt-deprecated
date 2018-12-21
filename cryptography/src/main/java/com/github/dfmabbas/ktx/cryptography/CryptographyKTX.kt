package com.github.dfmabbas.ktx.cryptography

import android.util.Base64
import java.security.MessageDigest

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

fun String.toSHA256(): String {
    val bytes = this.toByteArray()
    val md = MessageDigest.getInstance("SHA-256")
    val digest = md.digest(bytes)
    return digest.fold("") { str, it -> str + "%02x".format(it) }
}