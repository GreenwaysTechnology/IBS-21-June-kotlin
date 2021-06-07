package com.ibs.kotlin.coroutine


import kotlinx.coroutines.*


fun main() = runBlocking {
    println("Main Program starts ${Thread.currentThread().name}")
    GlobalScope.launch(Dispatchers.IO) {
        //async operation
        println("Back ground threads starts ${Thread.currentThread().name}")
        // Thread.sleep(5000)
        delay(5000)
        println("Back ground threads Finishes ${Thread.currentThread().name}")
    }
    GlobalScope.launch {
        //async operation
        println("Back ground threads starts ${Thread.currentThread().name}")
        delay(5000)
        //Thread.sleep(5000) // api calls // network calls
        println("Back ground threads Finishes ${Thread.currentThread().name}")

    }
    GlobalScope.launch {
        //async operation
        println("Back ground threads starts ${Thread.currentThread().name}")
        //Thread.sleep(5000)
        //delay(5000)
        sleepTime(5000)
        println("Back ground threads Finishes ${Thread.currentThread().name}")

    }
    println("Main Program ends ${Thread.currentThread().name}")
    //Pause the main thread
    // Thread.sleep(6000)

    delay(5000)
}

suspend fun sleepTime(time: Long) {
    delay(time)
}