package com.ibs.kotlin.oo.classes

//String,Integer,Many: can i add new method on existing classes without adding inside classes
//if i want to add my own string method inside String class?

class Calculator {}

//new Function : extension function is lambda

fun Calculator.sum(a: Int, b: Int) = a + b

fun Calculator.substract(a: Int, b: Int): Int {
    val result = a - b
    println("substract")
    return result
}

fun Calculator.add(i: Int, i1: Int): Int {
    return i + i1
}

infix fun Int.myAdd(i: Int): Int {
    println("this $this")
    return i + this
}

fun main() {
    val calc = Calculator()
    println(calc.sum(10, 10))
    var r = calc.substract(12, 34)
    println(r)
    println(calc.add(1, 1))

    var x: Int = 10;
    var y: Int = 20
    //normal function
    println(x.myAdd(y))

    //dsl code
    println (x myAdd y)

}

