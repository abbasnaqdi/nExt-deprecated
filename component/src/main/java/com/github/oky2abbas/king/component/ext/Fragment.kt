package com.github.oky2abbas.king.component.ext

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment

fun Fragment.appendFragment(frg: Fragment, frgId: Int) {
    fragmentManager?.beginTransaction()
        ?.replace(frgId, frg)
        ?.addToBackStack(null)
        ?.commit()
}

fun Fragment.callActivity(activity: Activity) {
    startActivity(
        android.content.Intent(
            this.activity, activity::class.java
        )
    )
}

fun Fragment.callActivity(activity: Activity, bundle: Bundle?) {
    val intent = android.content.Intent(this.activity, activity::class.java)
    bundle?.let { intent.putExtras(it) }
    startActivity(intent)
}

fun Fragment.callActivity(activity: Activity, result: Int) {
    val intent = android.content.Intent(this.activity, activity::class.java)
    startActivityForResult(intent, result)
}