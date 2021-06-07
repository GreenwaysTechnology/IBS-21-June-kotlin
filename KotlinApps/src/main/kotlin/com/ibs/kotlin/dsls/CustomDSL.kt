package com.ibs.kotlin.dsls

class Car {
    infix fun drive(speed: Int?) {
        println("driving")
    }
}

fun sayHello(greet: String.(String) -> Unit) {
    // greet("Hello","Jane")
    "Hello".greet("Jane")
}

class Meeting(val name: String) {
    val start = this;
    infix fun at(time: IntRange) {
        println("$name meeting starts at $time")
    }
}
infix fun String.meeting(block: Meeting.() -> Unit) {
    Meeting(this).block()
}

class Robot {
    var left = "left"
    var right = "right"
    var fast = "fast"
    infix fun turns(direction: String) {
        println("turns $direction")
    }

    infix fun runs(speed: String) {
        println("runs $speed")
    }
}

fun operate(block: Robot.(Robot) -> Unit) {
    val robot = Robot();
    robot.block(robot);
}
fun main() {

    "Planning" meeting {
        start at 3..15
    }
    "Project" meeting {
        start at 3..15
    }
    operate {
        it turns left
        it turns right
        it runs fast
    }
    val car = Car();
    car.drive(10)

    car drive 10 // simple dsl

    val greet = "hello";

    fun String.shout() = uppercase();

    println(greet.shout())

    sayHello { println("${this.uppercase()} $it") }
}