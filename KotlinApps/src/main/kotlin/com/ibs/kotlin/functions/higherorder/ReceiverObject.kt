package com.ibs.kotlin.functions.higherorder

public fun <T> T.receiver(block: T.() -> Unit) {
    block()
    println("this")
}

//public fun <T> T.receiver(block: T.() -> Unit): T {
//    block()
//    return this
//}

fun main() {
    "Hello".receiver(fun(res) {
        println(res)
    })
    1.receiver(fun(res) {
        println(res)
    })
}