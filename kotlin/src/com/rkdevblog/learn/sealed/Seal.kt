package com.rkdevblog.learn.sealed

//A sealed class is a class that can be subclassed, but only inside the file in which it's declared.
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

