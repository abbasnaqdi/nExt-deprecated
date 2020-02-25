package com.github.oky2abbas.nExt.widget

import android.widget.ViewFlipper

fun ViewFlipper.go(index: Int) {
    this.displayedChild = index
}