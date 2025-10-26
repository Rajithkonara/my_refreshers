package main

import (
	"fmt"
)

func main() {
	fmt.Println(solutionx("kayak"))
}

func reverse(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}

func solutionx(w string) string {
	n := len(w) / 2

	left := w[:n]
	right := reverse(w[n+1:])

	for i := 0; i < n; i++ {
		if left[i] != right[i] && (left[i] != '?' && right[i] != '?') {
			return "NO"
		}
	}

	return "YES"

}
