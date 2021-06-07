package com.ibs.kotlin.oo.classes.inheritance.abs

//parent
abstract class Animal {
    abstract fun eat(): String;
    abstract val type: String;
    fun saveAnimals(): String {
        return "Save Animals From Global Warming";
    }
}

//child
class Dog(override var type: String = "Domestic") : Animal() {
    //overriding
    override fun eat(): String {
        return "Dog eat";
    }

    fun bark(): String {
        return "$type Barking"
    }
}

fun main() {
    //var dog = Dog();
    var dog: Animal = Dog();
    println(dog.eat())
    println(dog.saveAnimals())
    //println(dog.bark())
    //calling sub class method of parent type
    var tempDog = dog as Dog;
    println(tempDog.bark())
}