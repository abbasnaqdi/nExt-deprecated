package com.github.oky2abbas.nExt.basic

import kotlin.random.Random

fun IntRange.generateRandom() =
    Random.nextInt(start, endInclusive + 1)