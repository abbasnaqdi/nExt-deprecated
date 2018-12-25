package com.github.dfmabbas.ktx.widget

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment


fun AppCompatActivity.appendFragment(fragment: Fragment, frameLayout: FrameLayout) {
    if (frameLayout.childCount == 0)
        supportFragmentManager
            .beginTransaction()
            .add(frameLayout.id, fragment, fragment.toString())
            .commit()
    else
        supportFragmentManager
            .beginTransaction()
            .replace(frameLayout.id, fragment, fragment.toString())
            .addToBackStack(null)
            .commit()
}

fun AppCompatActivity.appendFragment(
    fragment: Fragment,
    frameLayout: FrameLayout, bundle: Bundle?
) {
    fragment.arguments = bundle

    if (frameLayout.childCount == 0)
        supportFragmentManager
            .beginTransaction()
            .add(frameLayout.id, fragment, fragment.toString())
            .commit()
    else
        supportFragmentManager
            .beginTransaction()
            .replace(frameLayout.id, fragment, fragment.toString())
            .addToBackStack(null)
            .commit()
}

fun Activity.callActivity(activity: Activity, bundle: Bundle?) {
    val intent = Intent(this, activity::class.java)
    bundle?.let { intent.putExtras(it) }
    startActivity(intent)
}

fun Activity.callActivity(activity: Activity) {
    startActivity(Intent(this, activity::class.java))
}

fun Activity.callActivity(intent: Intent, result: Int) {
    startActivityForResult(intent, 1000)
}

fun Activity.isPermission(permissionArray: Array<String>): Boolean {
    if (Build.VERSION.SDK_INT < 23) return true

    val isRecord = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.RECORD_AUDIO
    ) == PackageManager.PERMISSION_GRANTED
    val isStorage = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    ) == PackageManager.PERMISSION_GRANTED

    if (!isRecord || !isStorage) ActivityCompat.requestPermissions(
        this,
        permissionArray, 0
    )

    return isRecord && isStorage
}