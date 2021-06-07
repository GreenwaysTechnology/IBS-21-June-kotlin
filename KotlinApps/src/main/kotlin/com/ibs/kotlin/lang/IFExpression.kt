package com.ibs.kotlin.lang

fun main() {
    var a = 100;
    var b = 200;
    var max = a;
    if (a < b) {
        max = b
    }
    println("Max $max")
    //Expression style
    if (a < b) max = b
    println("Max $max")
    //With else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Max $max")
    //As expression
    // As expression : more readable like tenary operator
    max = if (a > b) a else b
    println("Max with Expression $max")

    //expression with  branches - like statement max = a or b
    max = if (a > b) {
        print("Choose a - $a")
        a //return a value
    } else {
        print("Choose b ")
        b //return b value
    }
}