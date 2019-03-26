package com.github.oky2abbas.ktx.provider

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager

@SuppressLint("MissingPermission")
fun Context.isNetworkAvailable(): Boolean {
    val connectivityMgr = getSystemService(Context.CONNECTIVITY_SERVICE)
            as ConnectivityManager
    val networkInfo = connectivityMgr.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

fun Context.isPackageInstalled(pkg: String): Boolean {
    val packageInfoList = this.packageManager
        .getInstalledPackages(PackageManager.GET_ACTIVITIES)
    return packageInfoList.asSequence().filter { it?.packageName == pkg }.any()
}