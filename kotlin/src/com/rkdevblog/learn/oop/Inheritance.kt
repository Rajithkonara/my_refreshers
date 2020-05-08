package com.rkdevblog.learn.oop

// use open keyword, default classes cannot inherit
open class Inheritance(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9


    fun printSize() {
        println(shape)
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water / volume * 100.0}% full)")
    }
}
