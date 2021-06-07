package com.ibs.kotlin.functions.returns

//Imperative style
fun doubleIt(x: Int): Int {
    return x * 2
}

//Declarative Style : Single Expression function
// if y are only returning, you can remove {} and return statement
fun doubleItV2(x: Int): Int = x * 2
//Single expression and type inference in return
fun doubleItV3(x: Int = 1) = x * 2
//No return
fun printMe(name: String) = println("$name")

fun main() {
    println(doubleIt(10))
    println(doubleItV2(10))
    println(doubleItV3(10))
    printMe("Kotlin")


}