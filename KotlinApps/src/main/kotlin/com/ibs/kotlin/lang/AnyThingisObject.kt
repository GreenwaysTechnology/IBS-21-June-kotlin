package com.ibs.kotlin.lang

fun main() {
    val firstName = "Subramanian";
    //call methods on firstName
    println("${firstName.lowercase()}")
    val age = 40; // not primitive ; wrapper class
    println("${age.inc()}")

    val x = 100
    val y = 200
    //arithemtic operations
    var result = x + y;
    println("add result $result")
    result = x.plus(y)
    println("add result $result")
    result = x.minus(y)
    println("Substraction result $result")

    val a = 100;
    result = a.div(0);
    println(" Div by 0  $result")


}