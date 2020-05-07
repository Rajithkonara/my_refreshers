package com.rkdevblog.learn

// declare int assign it to null
var marbles: Int? = null
// this variable can be null

fun test() {

    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

}