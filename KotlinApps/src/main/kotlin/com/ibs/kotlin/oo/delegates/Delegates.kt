package com.ibs.kotlin.oo.delegates

import kotlin.properties.Delegates
import kotlin.reflect.KProperty


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}
class Example {
    //by keyword is used attach a delegate
    var p: String by Delegate()
}

class Demo {
    var mypro:String by Delegate()
}

class UserDelegate {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val example = Example();
    example.p = "Example" //set
    println(example.p) //get

    var demo = Demo()
    demo.mypro = "Demo property"

    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
    println(lazyValue)
    println(lazyValue)
    val user = UserDelegate()
    user.name = "first"
    user.name = "second"
    user.name = "third"
}