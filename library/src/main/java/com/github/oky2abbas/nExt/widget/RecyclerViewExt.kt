package com.github.oky2abbas.nExt.widget

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view)

fun RecyclerView.configDynamicGridLayout(dpi: Float) {
    layoutManager = GridLayoutManager(
        this.context, when (dpi) {
            in 1.5f..3.0f -> 2
            in 3.0f..4.0f -> 3
            else -> 1
        }
    ).apply {
        spanSizeLookup = object :
            GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return 1
            }
        }
    }
}