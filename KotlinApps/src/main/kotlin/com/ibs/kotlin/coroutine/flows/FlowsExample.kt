package com.ibs.kotlin.coroutine.flows

//
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

//async multi value : values are returned in one shot -  if list has 1000 elements, all thousand elements
//will be returned in one shot.
//suspend fun simple(): List<Int> {
//    delay(1000) // pretend we are doing something asynchronous here
//    return listOf(1, 2, 3)
//}
//
//fun main() = runBlocking<Unit> {
//    simple().forEach { value -> println(value) }
//}

//Flow : async multi value : but streaming


fun simple(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(1000) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    // Launch a concurrent coroutine to check if the main thread is blocked
//    launch {
//        for (k in 1..3) {
//            println("I'm not blocked $k")
//            delay(100)
//        }
//    }
    // Collect the flow
    val timeout = withTimeoutOrNull(2500) { // Timeout after 250ms
        simple().collect { value -> println(value) }
    }
}
//flows can be transformed