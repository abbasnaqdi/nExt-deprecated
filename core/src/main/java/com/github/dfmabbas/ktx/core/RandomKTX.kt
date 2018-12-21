package com.github.dfmabbas.ktx.core

import kotlin.random.Random

fun IntRange.generateRandom() =
    Random.nextInt(start, endInclusive + 1)