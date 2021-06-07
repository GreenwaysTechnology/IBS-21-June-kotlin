package com.ibs.kotlin.oo.enums

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
//
//enum class Color(val rgb: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}
interface MyColor {
    fun applyColor()
}

enum class Color(val rgb: Int) : MyColor {
    RED(0xFF0000) {
        override fun applyColor() {
            println("red color is applied")
        }
    },
    GREEN(0x00FF00) {
        override fun applyColor() {
            println("green color is applied")
        }

    },
    BLUE(0x0000FF) {
        override fun applyColor() {
            println("blue color is applied")
        }
    },
}
fun main() {
    println(Direction.NORTH)
    println(Color.BLUE)
    println(Color.BLUE.rgb)
    println(Color.BLUE.applyColor())
    val color = Color.BLUE
    when (color) {
        Color.BLUE -> println("Blue")
    }
}