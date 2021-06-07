package com.ibs.kotlin.oo.classes.inheritance.interfaces

interface Eatable {
    fun eat(): String;
}
interface SaveAnimals {
    fun save(): String {
        return "Save Animals";
    }
}
interface MyInterface {
    val Prop: Int; //abstract
}
class Dog : Eatable, SaveAnimals, MyInterface {
    override val Prop: Int
        get() = 12;

    override fun eat(): String {
        return "Dog Eats"
    }

    fun bark(): String {
        return "Bark"
    }
}

fun main() {
    //var dog = Dog();
    // var dog:Dog = Dog();
    var dog: Eatable = Dog();
    println(dog.eat());
    //calling sub class method of parent type
    var tempDog = dog as Dog;
    println(tempDog.bark())
    println(tempDog.save())
    println(dog.Prop)
}