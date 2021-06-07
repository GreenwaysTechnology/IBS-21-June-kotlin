package com.ibs.kotlin.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async(Dispatchers.IO) { doSomethingUsefulOne() }
        val two = async(Dispatchers.Default) { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    println("doSomethingUsefulOne ${Thread.currentThread().name}")
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("doSomethingUsefulTwo ${Thread.currentThread().name}")
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}