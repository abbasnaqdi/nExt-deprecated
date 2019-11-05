package com.github.oky2abbas.king.core.ext

import kotlin.random.Random

fun IntRange.generateRandom() =
    Random.nextInt(start, endInclusive + 1)