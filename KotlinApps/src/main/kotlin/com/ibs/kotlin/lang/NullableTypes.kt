package com.ibs.kotlin.lang

fun main() {
    //    ? marks a type as nullable  = null  + able (can) -variable can have null
    var name: String? = null;
    //name = "Subramaian"
    // //Soultion 1: Checking for null in condition
    if (name != null) {
        println("Nullable variables  Null ${name.length}")
    } else {
        println("Nullable variable having null value")
    }
    //Soultion 2 : Using safe Naviation Operator ?.
    println("Safe Navigation Operator ${name?.length}");  //Result would be null if variable is null

    //Soution 3 : Using Elvis Operator
    val res = name?.length ?: 0;
    println("Elvis Operator Result ${res}")

    //var str3: String? = "Hello";
     var str3: String? = null;
    //if you want Null Pointer Exception in case if it is null
    println("!! Operator : " + str3!!.length)

}