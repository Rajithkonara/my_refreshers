package com.rkdevblog.learn

fun main() {

    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    // Pair where the first part of the pair is itself a pair.
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    // Destructure some pairs and triples
    // 1) Destructure a pair and print the values.
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    // 2) Destructure a triple and print the values.
    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3")

}