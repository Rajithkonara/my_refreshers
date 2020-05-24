package com.rkdevblog.learn.generics

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }

}


fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalsCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.addWater()
}

fun main() {
    genericsExample()
}