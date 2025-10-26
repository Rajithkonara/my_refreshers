package main

import (
	"time"
)

// X * (X + 1)

func solution(a, b int) int {
	start := time.Now() // start timing
	count := 0
	// Not optimized solution
	for i := 1; i < b; i++ {
		con := i * (i + 1)
		if a <= con && con <= b {
			count++
		}
	}
	elapsed := time.Since(start)
	println("Execution time:", elapsed.String())
	return count
}

func main() {
	println(solution(1, 1_000_000_000))
}
