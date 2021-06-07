package com.ibs.kotlin.coroutine

import kotlin.concurrent.thread


fun main() {
    println("Main Program starts ${Thread.currentThread().name}")
    thread(name = "My Thread") {
        println("Back ground threads starts ${Thread.currentThread().name}")
        Thread.sleep(5000)
        println("Back ground threads Finishes ${Thread.currentThread().name}")
    }
    println("Main Program ends ${Thread.currentThread().name}")

}