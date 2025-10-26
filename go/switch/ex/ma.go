package main

import (
	"fmt"
	"math/rand"
)

func main() {
	randNumbers()
}

func randNumbers() {

	var num []int

	for i := 1; i <= 100; i++ {
		num = append(num, rand.Intn(100))
	}

	for _, v := range num {
		switch {
		case v%2 == 0:
			fmt.Println("two")
		case v%3 == 0:
			fmt.Println("three")
		case v%2 == 0 && v%3 == 0:
		default:
			fmt.Println("Never mind")
		}
	}

}
