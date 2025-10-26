package main

import (
	"fmt"
	"time"
)

func main() {

	ch := make(chan string)

	go func() {
		fmt.Println(time.Now(), "sleeping for 2 seconds")
		time.Sleep(2 * time.Second)
		ch <- "Hello"
	}()

	fmt.Println(time.Now(), "waiting for the message")

	v := <-ch

	fmt.Println(time.Now(), "received value: ", v)
}
