package com.klausner.kache

val localCache = LocalCache<String, Any>()

inline fun <T : Any> T.cached(key: String, block: () -> T): Any {
    val value = localCache.get(key)
    if (value == null) {
        val newValue = block()
        localCache.add(key, newValue)
    }
    return value!!
}