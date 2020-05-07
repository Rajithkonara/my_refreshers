package com.rkdevblog.learn

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //  it refers to each item as the filter loops through.
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it [0] == 'p' }
    println("lazy: $filtered")
    //When you return the filter results as a Sequence,
    // the filtered variable won't hold a new list—it'll hold a Sequence of the list elements
    // and knowledge of the filter to apply to those elements.
    // Whenever you access elements of the Sequence, the filter is applied, and the result is returned to you.

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")


    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${ lazyMap2.toList() }")

}

// By default, filter is eager,  each time you use the filter, a list is created
//To make the filter lazy,
// we can use a Sequence, which is a collection that can only look at one item at a time,
// starting at the beginning, and going to the end. Conveniently, this is exactly the API that a lazy filter needs.
