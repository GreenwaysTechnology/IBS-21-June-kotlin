package com.ibs.kotlin.coroutine.async

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    //fire and forget
    val job=GlobalScope.launch {
        //logic
        val user = fetchUser()
        println(user)
        // return "test"
    }
    val result=GlobalScope.async {
        val user = fetchUser()
        user
    }
    println(result.await())
//    job.join()
//    job.cancel()
    job.cancelAndJoin()
    result.cancelAndJoin()
  //  delay(1000)
}

suspend fun fetchUser(): List<String> {
    return listOf<String>("a", "b")
}