package com.github.oky2abbas.king.widget

import android.widget.ViewFlipper

fun ViewFlipper.go(index: Int) {
    this.displayedChild = index
}