package com.rkdevblog.learn.extensions

import com.rkdevblog.learn.AquariumPlant

class Extensions {

// Extension functions only have access to the public API of the class they're extending.
// Variables that are private can't be accessed.
// Note: Extension functions are resolved statically, at compile time, based on the type of the variable.
}

fun main() {
    prints()
}

fun String.hasSpaces() = find { it == ' ' } != null

fun prints() {
    println("Nospace s"?.hasSpaces())
}

// Extension properties
// add an extension property isGreen to AquariumPlant, which is true if the color is green.
val AquariumPlant.isGreen: Boolean
    get() = color == "green"





