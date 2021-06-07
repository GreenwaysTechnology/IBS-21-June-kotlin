package com.ibs.kotlin.lang

fun main(){
    val aStr: String = "Hello";
    //val bInt: Int = aStr as Int;
   // println(bInt)
    val cInt: Int? = aStr as? Int
    println("Type casted result ${cInt}") //safely  ClassCastException -null
    println("Type casted result ${cInt ?: "Sorry Cant cast"}") //safely  ClassCastException
}