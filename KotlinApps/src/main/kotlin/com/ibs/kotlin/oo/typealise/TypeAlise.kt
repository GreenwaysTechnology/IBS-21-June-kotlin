package com.ibs.kotlin.oo.typealise

typealias Subramanian<T> = (T) -> Boolean

fun foo(p: Subramanian<Int>) = p(42)

fun main() {
    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f)) // prints "true"

    val p: Subramanian<Int> = { it > 0 }
    println(listOf(1, -2).filter(p)) // prints "[1]"
}