package com.rkdevblog.learn.collections

fun main() {

    val list = listOf(1, 2, 3, 4, 5);
    print(list.sum())

    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    // iterate
    for (s in list2.listIterator()) {
        println("$s ")
    }

    //hash maps
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures["white spots"])

    //default
    println(cures.getOrDefault("bloating", "sorry, I don't know"))

    println(cures.getOrElse("bloating") {"No cure for this"})


    // mutable map
    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())

}