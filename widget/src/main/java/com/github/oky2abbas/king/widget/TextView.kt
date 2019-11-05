package com.github.oky2abbas.king.widget

import android.annotation.TargetApi
import android.os.Build
import android.widget.TextView

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun TextView.setDrawable(
    start: Int = 0, end: Int = 0,
    top: Int = 0, bottom: Int = 0
) {
    this.setCompoundDrawablesRelativeWithIntrinsicBounds(
        start, top,
        end, bottom
    )
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
fun TextView.cycleTextView() {
    maxLines = if (maxLines == 4) {
        lineCount
    } else {
        4
    }
}
