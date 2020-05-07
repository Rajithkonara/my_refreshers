package com.rkdevblog.learn

fun main() {
    val dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    val water: (Int) -> Int = { dirty -> dirty / 2 }
    println(water(20))

    //passing function as arg
    println(updateDirty(30, waterFilter))

    //The function you pass doesn't have to be a lambda;
    // it can be a regular named function instead. To specify the argument as a regular function,
    // use the :: operator. This way Kotlin knows that you are passing the function reference as an argument, not trying to call the function.

    //passing regular function
    println(updateDirty(15, ::increaseDirty))




}

fun increaseDirty(start: Int) = start + 1


// higher order functions, arguments to one function is another function

// The first argument is an integer. The second argument is a function that takes an integer and returns an integer
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}