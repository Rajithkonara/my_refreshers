package com.rkdevblog.learn// In kotlin almost everything is an expression and has a value

// println() does not return a value, so it returns kotlin.Unit
fun main() {
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    // String template
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}