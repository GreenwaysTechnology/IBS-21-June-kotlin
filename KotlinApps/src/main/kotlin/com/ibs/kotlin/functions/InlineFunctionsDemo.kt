package com.ibs.kotlin.functions

//callee
inline fun isMultipleOf(number: Int, multipleOf: Int): Boolean {
    return number % multipleOf == 0
}


fun main() {
    //caller
    val res = isMultipleOf(1, 23)
    println(res);
}