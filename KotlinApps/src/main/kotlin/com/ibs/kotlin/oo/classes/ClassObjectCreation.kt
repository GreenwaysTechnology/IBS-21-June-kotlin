package com.ibs.kotlin.oo.classes

//class HelloWorld {
//
//}
//Empty class ; class without any member
class HelloWorld

//class Person {
//    //instance variables
//    var firstName: String = "Subrmanian"
//    var lastName: String = "Murugan"
//    var age: Int = 18
//
//    //constructors
//    constructor() {
//        println("No arg constructor is called")
//    }
//
//    //paramerized constrctors
//    constructor(firstName: String, lastName: String, age: Int) {
//        println("arg constructor is called")
//        this.firstName = firstName
//        this.lastName = lastName
//        this.age = age
//    }
//
//    //methods : functions : member function
//    fun incAge(): Int {
//        return this.age.inc()
//    }
//
//}
//class header : Primary constructor : it is part of class header
//class Person constructor(val firstName: String = "", val lastName: String = "", var age: Int = 18) {
//    //methods : functions : member function
//    fun incAge(): Int {
//        return this.age.inc()
//    }
//}
//class Person(val firstName: String = "firstName", val lastName: String = "lastName", var age: Int = 18) {
//    //secondary constructors
//    constructor(age: Int) : this() {
//        println("secondary constructor $age")
//    }
//    //methods : functions : member function
//    fun incAge(): Int {
//        return this.age.inc()
//    }
//}

class Person(val firstName: String? = "firstName", val lastName: String? = "lastName", var age: Int? = 18) {

    //initializer - looks like instance blocks in java
    init {
        println("Init block")
    }

    //secondary constructors
    constructor(age: Int) : this() {
        println("secondary constructor $age")
    }

    //methods : functions : member function
    fun incAge(): Int {
        return this.age?.inc() ?: 0
    }
}

//class Foo (lateinit var myfoo:String) {
class Foo {
    //Property must be initialized or be abstract
    //  var bar:String? =null;
    //var bar: String? = ""
    //i dont want to initlaize the property here, i may initalize later
    lateinit var bar: String
//    constructor(lateinit mybar:String,test:String):this(){
//
//    }
}

class Customer {
    var firstName: String? = null
        set(value) {
            //field is builtin variable which always referes instance variable
            //backinng field
            field = value
        }
        get() = field

    var age: Int? = null
        set(value) {
            if (value?.compareTo(18)!! < 0) {
                throw  Exception("Age must be greater than 18")
            } else {
                field = value;
            }
        }

}

//entity classes:
//equals,hashcode,toString,copy......
data class User(val name: String, val password: String) {
    var token: String = "AAAA" // will not be added in code generation
}


fun main() {
    //create instance
    val hello = HelloWorld()
    println(hello)
    //
    var person = Person()
    //access object properties
    println("${person.firstName} ${person.lastName}")
    //change variables
    // person.firstName = ""
    person.age = 19
    println("Age ${person.age}")
    var newAge = person.incAge()
    println("updated Age $newAge")

    //arg - constructor
    person = Person("Geetha", "Subramanian", age = 20)
    println("${person.firstName} ${person.lastName} ${person.age}")

    person = Person(age = 35)
    println("${person.firstName} ${person.lastName} ${person.age}")

    var customer = Customer()
    customer.firstName = "Subramaian";
    // customer.age = 12
    customer.age = 23
    println("Customer ${customer.firstName} ${customer.age}")

    var user = User("Ram", password = "secrete")
    println(user)
    //clone -  copy
    val copyUser = user.copy("Karthik", password = "demo")
    println(copyUser)
    println("User details")
    println("${user.name} ${user.password}")

    //destructuring
    val (name, password) = user;
    println("$name $password")


}