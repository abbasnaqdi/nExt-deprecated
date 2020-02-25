package com.github.oky2abbas.nExt.basic

import android.os.CountDownTimer

fun <T, F> runLoop(
    totalTimeMSecond: Long, partMSecond: Long,
    tick: (current: Long) -> T, finish: () -> F
): CountDownTimer {
    return object : CountDownTimer(
        totalTimeMSecond,
        partMSecond
    ) {
        override fun onFinish() {
            finish()
        }

        override fun onTick(millisUntilFinished: Long) {
            tick(millisUntilFinished)
        }
    }
}