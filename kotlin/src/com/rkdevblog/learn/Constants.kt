package com.rkdevblog.learn

// top level constant
const val rocks = 3

//  The value for const val is determined at compile time, where as the value for val is determined during program execution,
//  which means, val can be assigned by a function at run time.
// That means val can be assigned a value from a function, but const val cannot.
fun main() {

}

// Kotlin does not have a concept of class level constants.
// To define constants inside a class, you have to wrap them into companion objects
// declared with the companion keyword. The companion object is basically a singleton object within the class.

class MyClass {
    companion object {
        const val CONSTANT = "constant in companion"
    }
}

//The basic difference between companion objects and regular objects is:
//
//Companion objects are initialized from the static constructor of the containing class, that is, they are created when the object is created.
//Regular objects are initialized lazily on the first access to that object; that is, when they are first used.
//There is more, but all that you need to know for now is to wrap constants in classes in a companion object.