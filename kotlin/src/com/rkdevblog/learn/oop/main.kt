package com.rkdevblog.learn.oop

fun buildAquarium() {
    val aquarium = AClass()
    aquarium.printSize()

    // default height and length
    val aquarium2 = AClass(width = 25)
    aquarium2.printSize()

    // default width
    val aquarium3 = AClass(height = 35, length = 110)
    aquarium3.printSize()

    // everything custom
    val aquarium4 = AClass(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // calling secondary constructor
    val aquarium6 = AClass(numberOfFish = 29)
    aquarium6.printSize()

    //set volume
    aquarium6.volume = 70
    aquarium6.printSize()

//    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")

}

fun main() {
    buildAquarium()
}