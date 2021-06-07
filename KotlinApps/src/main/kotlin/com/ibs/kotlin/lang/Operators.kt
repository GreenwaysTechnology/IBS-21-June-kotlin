package com.ibs.kotlin.lang

fun main() {
    //operators
    println("MathMatical Operators")
    val a = 10;
    val b = 20;
    var c = a + b;
    println("Add $c")
    c = a - b;
    println("Substract $c")
    c = a * b;
    println("Multiply $c")
    c = a / b;
    println("Div $c")
    c = a % b;
    println("Mod $c")
    println("Augmented  Operators")
    c += 10;
    println("Augmented  $c")
    //Increment and Decrement Operators
    var counter = 1;
    println("Increment ${++counter} ${counter.inc()}")
    println("Logical Operators")

    var isvalid = true;
    var isEnabled = true;
    var booleanResult = isvalid && isEnabled;
    println("Boolean Result $booleanResult")

    println("Comparsional  Operators")
    //Equal
    val x = 100
    val y = 100
    var eqResult = x == y;  // x.equals(y)
    println("Strutural Equal $eqResult")

    var s = "hello";
    var s1 = s;
    eqResult = s === s1;
    println("Reference Equal $eqResult")

}