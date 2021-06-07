package com.ibs.kotlin.functions.higherorder

import kotlin.concurrent.thread

//Promote this is as higher Order
fun sayGreet(action: () -> Unit) {
    //invoke function
    action();
}

fun sayHai(action: (name: String?) -> Unit) {
    action("Subramanian");
}

fun doProcess(action: (String) -> String) {
    val res = action("hello")
    println("$res")
}

fun login(userName: String = "", password: String = "", resolve: (String) -> Unit, reject: (String) -> Unit) {
    val status = "Login Success"
    val errMessage = "Login failed"
    if (userName == "admin" && password == "admin") resolve(status) else reject(errMessage)
}

//Nullable and function type
fun compute(action: ((Int) -> Unit)?) {
    //Reference has a nullable type '((Int) -> Unit)?', use explicit '?.invoke()' to make a function-like call instead
    action?.invoke(10)
}

fun computeWithoutNullable(action: (Int) -> Unit) {
    //Reference has a nullable type '((Int) -> Unit)?', use explicit '?.invoke()' to make a function-like call instead
    //action?.invoke(10)
    //action(20);
    action.invoke(30)
}

//concurrency ; regular threads
fun delay(callback: (String) -> Unit) {
    //showing some delay
    thread(name = "IBS Thread") {
        //delay
        Thread.sleep(5000)
        //after 5sec return some response: Simulate non blocking
        callback("Hey I am delayed - ${Thread.currentThread().name}")
    }
}

fun main() {
    //Anonymous function

    delay(fun(message) {
        println(message);
    })
    sayGreet(fun() {
        println("Hello,I am Callback Function")
    })
    sayHai(fun(name) {
        println("Hai $name")
    })
    doProcess(fun(message: String): String {
        return "Ok! $message"
    })
    login(userName = "admin", password = "admin", fun(status) {
        println(status)
    }, fun(err) {
        println(err)
    })
    login(userName = "foo", password = "bar", fun(status) {
        println(status)
    }, fun(err) {
        println(err)
    })
    //
    compute(fun(res) {
        println(res);
    })
    compute(null);
    computeWithoutNullable(fun(res) {
        println(res);
    })

}