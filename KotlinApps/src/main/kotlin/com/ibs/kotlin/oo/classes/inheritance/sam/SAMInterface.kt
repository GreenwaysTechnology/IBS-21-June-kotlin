package com.ibs.kotlin.oo.classes.inheritance.sam

//SAM - Single Abstract method
fun interface KRunnable {
    fun invoke()
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

fun main() {
    // Object literals
    var runner = object : KRunnable {
        override fun invoke(): Unit {
            println("invoke")
        }
    }
    runner.invoke()
    // Creating an instance of a class
    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }
    println(isEven.accept(12))
}