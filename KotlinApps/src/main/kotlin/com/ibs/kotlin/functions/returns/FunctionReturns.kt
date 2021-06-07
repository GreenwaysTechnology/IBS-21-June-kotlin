package com.ibs.kotlin.functions.returns

fun sayHello(): String {
    return "Hello";
}

//Return type must be speficied
//fun sayHai() {
//    return "Hello"; //error
//}
fun sayHai(): String? {
    val message = "hai";
    //val message = null;
    return message
}

//no return type : Unit
// * The type with only one value: the `Unit` object. This type corresponds to the `void` type in Java.
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there")
}

fun login(name: String?, password: String?): Any? {
    //if (name == "admin" && password == "admin") return "Login success" else return Unit;
    return if (name == "admin" && password == "admin") "Login success" else Unit;
}

fun evenOrOdd(myNumber: Int): Any {
    return when {
        myNumber % 2 == 0 -> "$myNumber Even"// String parent is Any
        myNumber % 2 !== 0 -> "$myNumber Odd"  //String parent is Any
        else -> println("No Match Found")  //no return - Void - Unit parent is Any
    }
}

fun main() {
    var hello = sayHello()
    println(hello.uppercase())
    println(sayHai()?.uppercase())
    printHello("Subramanian")
    printHello(null)
    var res = login("adminxxx", "admin")
    //is Operator eq to instance of operator
    if (res is Unit) {
        println("Login failed")
    } else {
        println(res);
    }
    var isEvenOrOdd = evenOrOdd(13)
    println(isEvenOrOdd)
    isEvenOrOdd = evenOrOdd(12)
    println(isEvenOrOdd)
    isEvenOrOdd = evenOrOdd(0)
    println(isEvenOrOdd)

}