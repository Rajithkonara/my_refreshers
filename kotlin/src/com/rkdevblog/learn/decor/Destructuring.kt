package com.rkdevblog.learn.decor

data class Destructuring(val rocks: String, val wood: String, val driver: String) {
}

fun makeDecorations() {
    val d5 = Destructuring("crystal", "wood", "diver")
    println(d5)

   // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    // you can skip variables by using _

}

fun main() {
    makeDecorations()
}