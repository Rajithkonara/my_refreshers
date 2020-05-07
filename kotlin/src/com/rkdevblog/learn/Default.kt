package com.rkdevblog.learn

fun main() {
    swim()
    swim("slow")
    feedFish()
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

// calling a method from string template
fun feedFish() {
    val day = "Sunday"
    val food = "Rice"
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}