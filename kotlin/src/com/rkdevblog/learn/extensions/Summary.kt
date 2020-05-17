package com.rkdevblog.learn.extensions

/*

Pairs and triples can be used to return more than one value from a function. For example:

val twoLists = fish.partition { isFreshWater(it) }

Kotlin has many useful functions for List, such as reversed(), contains(), and subList().

A HashMap can be used to map keys to values. For example:
val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

Declare compile-time constants using the const keyword. You can put them at the top level,
organize them in a singleton object, or put them in a companion object.

A companion object is a singleton object within a class definition, defined with the companion keyword.

Extension functions and properties can add functionality to a class. For example:
fun String.hasSpaces() = find { it == ' ' } != null

A nullable receiver allows you to create extensions on a class which can be null.
The ?. operator can be paired with apply to check for null before executing code. For example:
this?.apply { println("removing $this") }

 */