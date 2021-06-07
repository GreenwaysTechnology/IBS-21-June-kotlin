package com.ibs.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
                // yield()
            }
        } catch (es: CancellationException) {
            println("exception is caught")
        } finally {
            //this runs in separate context
            withContext(NonCancellable) {
                delay(500)
                println("Finally")
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
//    job.cancel() // cancels the job
//    job.join() // waits for job's completion
    job.cancelAndJoin()
    println("main: Now I can quit.")
}