package com.klausner.kache

import kotlin.random.Random

fun main() {
    val localCache = LocalCache<String, String>()
    val string = getRandom("123")
}

fun getRandom(key: String) = cached(key) {
    return Random.nextInt().toString()
}