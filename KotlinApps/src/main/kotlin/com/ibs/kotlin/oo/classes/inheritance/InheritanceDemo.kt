package com.ibs.kotlin.oo.classes.inheritance

//parent
open class Animal {
    open fun eat(): String {
        return "Animal eat";
    }
}

//child
class Dog : Animal() {
    override fun eat(): String {
        return "Dog eat" + super.eat();
    }

    fun bark(): String {
        return "Barking"
    }
}

fun main() {
    //var dog = Dog();
    var dog: Animal = Dog();
    println(dog.eat())
    //println(dog.bark())
    //calling sub class method of parent type
    var tempDog = dog as Dog;
    println(tempDog.bark())
}