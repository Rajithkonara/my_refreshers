package com.rkdevblog.learn.decor

data class Decoration(val rocks: String) {
}

fun makeDecoration() {
    val decoration1 = Decoration("Granite")
    println(decoration1)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("Slate")
    println(decoration3)

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)
}

fun main() {
    makeDecoration()
}