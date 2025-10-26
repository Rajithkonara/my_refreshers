package main

import (
	"fmt"
)

func main() {

	fmt.Println(solutionRep("CBACD"))
	fmt.Println(solutionRep("CABABD"))
	fmt.Println(solutionRep("ACBDACBD"))
}

func solutionRep(s string) string {
	var stack []rune // Use a slice of runes as the stack
	newString := []rune(s)

	for _, r := range newString {
		size := len(stack)
		if size > 0 &&
			((stack[size-1] == 'A' && r == 'B') ||
				(stack[size-1] == 'B' && r == 'A') ||
				(stack[size-1] == 'C' && r == 'D') ||
				(stack[size-1] == 'D' && r == 'C')) {
			stack = stack[:size-1] // Pop the last element
		} else {
			stack = append(stack, r) // Push the current character
		}
	}

	return string(stack) // Convert the rune slice back to a string
}
