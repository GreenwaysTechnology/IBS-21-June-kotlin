package com.ibs.kotlin.lang

fun main() {
    //Loops
    for (i in 1..10) {
        println(i)
    }
    println("..............")
    //reverse order
    //downTo is function : 4.downTo(1)
    for (i in 4 downTo 1) {
        println(i)
    }
    println("..............")
    //incremented way increment by 3/5
    for (i in 1..10 step 2) {
        println(i)
    }
    println("..............")
    //incremented way increment by 3/5
    for (i in 4 downTo 1 step 2) {
        println(i)
    }
    //until
    println("......Until........")

    for (i in 1 until 10) {
        println(i)
    }
    //while :like java
    var x = 1;
    while (x <= 10) {
        println(x)
        x++
    }
    //do while: like java
    var a = 1;
    do {
        println("do while $a")
        a++
    } while (a <= 10)
}