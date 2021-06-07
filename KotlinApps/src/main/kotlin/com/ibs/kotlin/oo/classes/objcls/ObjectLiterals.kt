package com.ibs.kotlin.oo.classes.objcls

object Message {
    var success: String = "sucess"
}

object Customer {
    //static variable
    var id: Int = 10;

    //static variable
    fun getMessage(): String {
        return "Hello"
    }
}

class MyClass {

        companion object {
        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }
}

fun main() {


    println(Customer.id)
    println(Customer.getMessage())
    println(Message.success)

    println(MyClass.count)          // You can print it and check result

    println(MyClass.typeOfCustomers())
}