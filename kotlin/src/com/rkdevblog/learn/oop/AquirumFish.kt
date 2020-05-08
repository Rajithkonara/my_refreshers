package com.rkdevblog.learn.oop

//Abstract classes are always open

//If properties or methods are abstract, the subclasses must implement them.


interface FishAction {
    fun eat()
}

// implementing the interface
abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : AquariumFish() {
    override val color = "gray"
}

class Plecostomus : AquariumFish() {
    override val color = "gold"
}