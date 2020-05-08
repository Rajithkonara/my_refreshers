package com.rkdevblog.learn.oop

import java.lang.Math.PI

//Note: Subclasses must declare their constructor parameters explicitly.
class TowerTank(override var height: Int, var diameter: Int) :
    Inheritance(height = height, width = diameter, length = diameter) {

    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"


}
