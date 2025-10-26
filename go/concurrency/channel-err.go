package main

import "fmt"

// This program will panic because the channel is not buffered and the main goroutine is blocked.
// The main goroutine is blocked because it is trying to send a value to the channel but there is no
//  goroutine to receive the value. fatal error: all goroutines are asleep - deadlock!

func main() {
	var ch chan int
	ch = make(chan int)

	ch <- 10

	v := <-ch
	fmt.Println("reveived value: ", v)
}
