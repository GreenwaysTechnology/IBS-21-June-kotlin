package com.ibs.kotlin.collections

//Mutable and immutable collections -  list,set,map

fun main() {
    val list = listOf<String>("Subramanian", "Murugan", "Dhivya Sree", "Shirisha")
    list.forEach { i -> println(i) }
    //val numList = mutableListOf<Int>(1, 2, 3, 4);
    var values = mutableListOf<Int>(1, 2, 3, 4)
    values.add(12)
    values.add(15)
    values.add(192)
    values.add(120)
    //all functional collection apis are also available
  //  values.forEach { i -> println(i) }
    values.filter { it > 20 }.forEach(::println)

    val mymap = mutableMapOf<String, Int>("key1" to 1, "key2" to 2, "key3" to 3)
    mymap.forEach(::println)

}