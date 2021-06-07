package com.ibs.kotlin;
//
////syntax 1
//fun counter(): Function<Int> {
//    fun add (a: Int, b: Int): Int {
//        return a + b
//    }
//    return ::add
//}
////syntax 2
////fun counter(): Function<Int> {
////    //anonymous function
////    return fun(a: Int, b: Int): Int {
////        return a + b
////    }
////}
////fun counter(): Function<Int> {
////    //lambda
////    val sum = { a: Int, b: Int ->
////        a + b
////    }
////    return sum;
////}
//
////fun counter(): Function<Int> {
////    //lambda
////    return { a: Int, b: Int ->
////        a + b
////    }
////}
//
//fun main() {
//    val add = counter();
//    println(add(3, 8))
//    println(add(30, 80))
//}