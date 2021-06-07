package com.ibs.kotlin.oo.classes.inheritance.sealedcls

sealed class Data {
    data class Success(val data: String) : Data()
    data class Error(val error: String) : Data()
    object Loading : Data()
}

fun getData(): Data {
    // Data is outer class, Success is innerclass -  outer.inner()
    return Data.Success((100..1000).random().toString())
}


fun main() {
    val data = getData()
    val res: Any = when (data) {
        //is is eq instance of operator
        is Data.Success -> {
            println(data)
        }
        is Data.Error -> {
            println(data)
        }
        is Data.Loading -> {
            println(data)
        }
    }
}