package com.github.oky2abbas.nExt.crypto

import java.security.MessageDigest

fun String.toHash256(): String {
    val bytes = this.toByteArray()
    val md = MessageDigest.getInstance("SHA-256")
    val digest = md.digest(bytes)
    return digest.fold("") { str, it -> str + "%02x".format(it) }
}