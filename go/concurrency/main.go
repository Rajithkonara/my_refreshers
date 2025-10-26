package main

import "fmt"

//Concurrency
// is the ability to run multiple programs or parts of a program in parallel.
// Parallelism is a type of concurrency where multiple programs execute simultaneously. (doing multiple things at the same time)

// Goroutines - Independently executing functions, using go keyword
// channels - a way for goroutines to communicate with each other, mechanism send and receive values.

func main() {
	go hello()
}

func hello() {
	fmt.Println("Hello")
}

// -< indicate data flowing receiver for channel
// <- channel to value
