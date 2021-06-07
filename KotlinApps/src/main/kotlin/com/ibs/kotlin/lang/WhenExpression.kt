package com.ibs.kotlin.lang

import java.lang.Integer.parseInt

fun main() {
    var x = 12
    when (x) {
        //branch
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
    var y = 10;
    when (y) {
        0, 10 -> println("y value is from 0 or 10 $y")  //Union Operator either this or that
        else -> println("otherwise")
    }
    var s = "100"
    x = 100
    when (x) {
        parseInt(s) -> println("s encodes x") //  100
        else -> println("s does not encode x")
    }

    //range operator
    var validNumbers = 1..20;
    //Range and in
    x = 10
    when (x) {
        in 1..10 -> println("x is in the range $x")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
    //When as expression : you can store into a variable.
    //here when looks like a function call.
    //if when is a function x and {} are parameters when(x,{}) // when(x) {}
    x = 300
    var myExpression = when (x) {
        100 -> x * 100 //return value
        else -> "When expression" //return value
    }
    println("When result $myExpression")

    //when without condition
    var myNumber = 100
    var isEvenOrOdd:Any = when {
        myNumber % 2 == 0 -> 0  // Int parent is Any
        myNumber % 2 !== 0 -> "Odd"  //String parent is Any
        else -> println("No Match Found")  //no return - Void - Unit parent is Any
    }
    println("isEvenOrOdd :  $isEvenOrOdd")

    //java.lang.Object is super Type  -  Integer a  is OBject Employee is Object

}