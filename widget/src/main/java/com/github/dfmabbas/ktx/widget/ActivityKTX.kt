package com.github.dfmabbas.ktx.widget

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
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

fun AppCompatActivity.callActivity(activity: AppCompatActivity, bundle: Bundle?) {
    val intent = Intent(this, activity::class.java)
    bundle?.let { intent.putExtras(it) }
    startActivity(intent)
}

fun AppCompatActivity.callActivity(activity: AppCompatActivity) {
    startActivity(Intent(this, activity::class.java))
}

fun AppCompatActivity.callActivity(intent: Intent, result: Int) {
    startActivityForResult(intent, 1000)
}
