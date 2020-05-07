package com.rkdevblog.learn

fun main() {
    val schools = listOf("mackerel", "trout", "halibut")
    println(schools)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    // create arrays
    val school = arrayOf("shark", "salmon", "minnow")
    println(school.contentToString())

    for (element in school) {
        print("$element ")
    }

//    with index
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    val numbers = intArrayOf(1, 2, 3)
}

