package com.klausner.kache

interface Cache<T, W> {
    fun get(key: T): W?
    fun add(key: T, obj: W)
    fun invalidate(key: T)
}