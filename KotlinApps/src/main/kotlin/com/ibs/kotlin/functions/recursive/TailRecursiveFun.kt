package com.ibs.kotlin.functions.recursive

val eps = 1E-10 // "good enough", could be 10^-15

//add tailrec modifier to apply algorthim
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

tailrec fun factorial(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    println(factorial(10))
    println(findFixPoint())
}