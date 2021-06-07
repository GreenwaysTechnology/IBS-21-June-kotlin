package com.ibs.kotlin.lang

fun main() {
    //declare variable
    //mutable
    var firstName: String = "Subramanian"
    //immutable
    val lastName: String = "Murugan";
    //String interpolation:
    println("First Name $firstName last Name $lastName")

    firstName = "Ram"
    println("First Name $firstName last Name $lastName")

    //  lastName = "Foo"
    var age: Int = 40;
    println("Age $age")

    //boolean
    var isActive: Boolean = true;
    println("isACtive $isActive")

    //Type inference: if you dont tell type, type of variable is implicitly assigned
    var salary = 1000.45f;
    var isAllowed = true;
    println("Salary $salary")
    println("isAllowed $isAllowed")


}