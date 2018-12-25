package com.github.dfmabbas.ktx.widget

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.appendFragment(frg: Fragment, frgId: Int) {
    fragmentManager?.beginTransaction()
        ?.replace(frgId, frg)
        ?.addToBackStack(null)
        ?.commit()
}

fun Fragment.callActivity(activity: AppCompatActivity) {
    startActivity(
        android.content.Intent(
            this.activity, activity::class.java
        )
    )
}

fun Fragment.callActivity(activity: AppCompatActivity, bundle: Bundle?) {
    val intent = android.content.Intent(this.activity, activity::class.java)
    bundle?.let { intent.putExtras(it) }
    startActivity(intent)
}

fun Fragment.callActivity(activity: AppCompatActivity, result: Int) {
    val intent = android.content.Intent(this.activity, activity::class.java)
    startActivityForResult(intent, result)
}