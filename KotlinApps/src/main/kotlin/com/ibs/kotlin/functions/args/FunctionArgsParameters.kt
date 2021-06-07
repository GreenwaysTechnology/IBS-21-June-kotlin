package com.ibs.kotlin.functions.args

//sayHello(var/val) is not allowed
fun sayHello(name: String = "default Value") {
    println("Hello $name")
}

fun add(a: Int = 0, b: Int = 0) {
    val c = a.plus(b);
    println("Add Result $c")
}

fun sayGreet(name: String? = "Greet") {
    println("Hello ${name?.uppercase()}")
}

fun printMe(myvar: Any? = "") {
    println("My Value $myvar")
}

//variable args
fun logger(vararg args: String) {
    for (arg in args) println(arg)
}

////////////////////////////////////////////////////////
//more args
fun format(
    str: String,
    normlizeCast: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
) {
    println("$str $normlizeCast $upperCaseFirstLetter $divideByCamelHumps $wordSeparator")
}


fun main() {
    //parameter
    sayHello("Subramanian")
    //no parameter
    sayHello();
    add(1, 2)
    add()
    sayGreet("Subramanian")
    sayGreet()
    val greetMessage: String? = null;
    sayGreet(greetMessage)
    printMe(12)
    printMe("hello")
    //supply var args
    logger("Employee.kt", "Waring", "Save method is not called")
    logger("Employee.kt", "error", "remove throws error", "402")

    //format
    format("Hello", upperCaseFirstLetter = false)
    format("hello", wordSeparator = ',')

}