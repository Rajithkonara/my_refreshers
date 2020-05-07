package com.rkdevblog.learn

import

fun main() {
    swim()
    swim("slow")
}

// Default args
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

//required params
// should pass params if no default

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}