package com.ibs.kotlin.functions.generics

fun <T> setValue(item: T) {
    println(item);
}

fun main() {
    var value = setValue<Int>(10)
    println(value)
    value = setValue<String>("Subramanian")
}