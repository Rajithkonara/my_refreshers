package com.rkdevblog.learn.extensions

import com.rkdevblog.learn.AquariumPlant

// The class you extend is called the receiver, and it is possible to make that class nullable.
// If you do that, the this variable used in the body can be null, so make sure you test for that.
// You would want to take a nullable receiver if you expect that callers will want to,
// call your extension method on nullable variables, or if you want to provide a default behavior when your function is applied to null.

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun main() {
    val plant: AquariumPlant? = null
    plant.pull()
}