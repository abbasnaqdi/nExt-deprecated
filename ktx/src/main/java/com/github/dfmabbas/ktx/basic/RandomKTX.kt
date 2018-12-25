package com.github.dfmabbas.ktx.basic

import kotlin.random.Random

fun IntRange.generateRandom() =
    Random.nextInt(start, endInclusive + 1)