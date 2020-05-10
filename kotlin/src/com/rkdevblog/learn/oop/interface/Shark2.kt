package com.rkdevblog.learn.oop.`interface`

import com.rkdevblog.learn.oop.FishAction

class Shark2 : FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}