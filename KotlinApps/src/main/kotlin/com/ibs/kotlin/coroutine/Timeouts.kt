package com.ibs.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    withTimeout(2000) {
        // api call
        for (i in 0..500) {
            print("$i.");
            delay(500)
        }
    }
}