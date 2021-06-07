package com.ibs.kotlin.functions.lambdas

import kotlin.concurrent.thread

//normal function
fun add(a: Int? = 1, b: Int? = 1): Int? {
    return a?.plus(b ?: 0);
}

//function expression
fun addExpress(a: Int = 1, b: Int) = a.plus(b);

//without type inference
//val sum: (Int, Int) -> Int = { a: Int, b: Int ->
//    println("Sum lambda ")
//     a + b //return
//}
//lambda with type inference and return type is also infered
val sum = { a: Int, b: Int ->
    println("Sum lambda ")
    //last expression would be return value and accordingly type is updated
    a + b //return
    //   "Hello"
    // true
}

//literal means value - 10,"Hello",true, Object, func is literal -| any , lambda
//lambda has no args and parameters
val greeter = {
    println("Greeter Me")
    println("Greeter Me")
    println("Greeter Me")
}

///if lambda has single parameter, we dont need to declare arg variable and ->, kotlin supplies
//implicit variable called "it"
//var sayMyName = { name: String -> name.uppercase() }
//when we use "it" , we need to tell the arg and return type
var sayMyName: (String) -> String = { it.uppercase() }

//Higher order function and lambda
fun sayGreet(action: () -> Unit) {
    //calling function: callback
    action()
}

//int,fun
fun compute(n: Int, action: (Double) -> Unit) {
    action(n * 2.1);
}

//This is not recommended design
//fun format(
//    block: () -> Unit,
//    str: String,
//    normlizeCast: Boolean = true,
//    upperCaseFirstLetter: Boolean = true,
//    divideByCamelHumps: Boolean = false,
//    wordSeparator: Char = ' ',
//) {
//    println("$str $normlizeCast $upperCaseFirstLetter $divideByCamelHumps $wordSeparator")
//    block()
//}

fun format(
    str: String,
    normlizeCast: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
    block: () -> Unit // function type at end of arg list
) {
    println("$str $normlizeCast $upperCaseFirstLetter $divideByCamelHumps $wordSeparator")
    block()
}

//returning lambda from higher order function
fun counter(): Function<Int> {
    //lambda
    return { a: Int, b: Int ->
        a + b
    }
}

fun main() {
    println(add(1, 2))
    println(addExpress(3, 8))
    println(sum(34, 90))
    greeter()
    println(sayMyName("Subramanian"))

    //pass lambda as parameter as part of function parameter
    sayGreet({
        println("Hello Lambda as parameter")
    })
    //DSL Like syntax : when you pass lambda as parameter we dont need to use ()
    sayGreet {
        println("Hello Lambda as parameter")
    }
    compute(2, { println(it) })

    //DSL Like syntax : when you pass lambda as parameter we dont need to use ()
    compute(2) { println(it) }

    thread(name = "IBS Thread") {
        //delay
        Thread.sleep(5000)
        //after 5sec return some response: Simulate non blocking
    }
    //is this is DSL Friendly : No
    // format { println("something") }, ( "", normlizeCast = true)
    //Kotlin recommends if fun takes more args along with lambda , function type should be last arg
    //so that we can ommit , ()

    format("str", normlizeCast = true, wordSeparator = ',') {
        println("Awesome lambda")
    }

    //lambda stored in a variable
    val awesome = { println("Awesome lambda") }
    format("str", normlizeCast = true, wordSeparator = ',', block = awesome)

    val add = counter();
    println(add(3, 8))
}
