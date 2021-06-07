package com.ibs.kotlin.functions

//declare function
fun sayHello() {
    //fun body
    println("sayHello")
}

//main function
fun main() {
  //function invocation
    sayHello()
    println(sayHello().javaClass)
}