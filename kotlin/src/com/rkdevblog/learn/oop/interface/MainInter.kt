package com.rkdevblog.learn.oop.`interface`

import com.rkdevblog.learn.oop.FishAction

fun main() {}

// Singleton
object GoldColor : FishColor {
    override val color = "gold"
}


class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}