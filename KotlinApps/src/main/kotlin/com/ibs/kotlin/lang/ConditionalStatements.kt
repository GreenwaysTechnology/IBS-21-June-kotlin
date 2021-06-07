package com.ibs.kotlin.lang

fun main() {
    //return statement; used in normal expression
    val message: String? = "hello";
    val s = message ?: return
    println(s);

    // exception
    //val name:String = "Subramanian"
    val name: String? = null;
   // val s1 = name ?: throw IllegalArgumentException("Name required")
   // println(s1.toString());
    //break  and continue
    foo@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == 50) break@foo
            println("i=$i j=$j")
        }
    }


}