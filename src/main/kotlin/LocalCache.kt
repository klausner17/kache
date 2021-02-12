package com.klausner.kache

class LocalCache<T, W> : Cache<T, W> {

    private val map: HashMap<T, W> = hashMapOf()

    override fun get(key: T) = map[key]

    override fun add(key: T, obj: W) {
        map[key] = obj
    }

    override fun invalidate(key: T) {
        map.remove(key)
    }
}