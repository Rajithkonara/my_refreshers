package com.rkdevblog.learn.oop

fun buildAquarium2() {
    val aquarium6 = Inheritance(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    // Subclass
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}


fun main() {
    buildAquarium2()
}