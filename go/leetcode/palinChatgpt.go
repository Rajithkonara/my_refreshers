package main

import (
	"fmt"
	"strings"
	"unicode"
)

func solutionc(s string) string {

	// Convert the string to lowercase
	SLower := strings.ToLower(s)
	n := len(SLower)
	result := []rune(SLower)
	left, right := 0, n-1

	for left <= right {
		// Skip non-alphabetic characters on the left
		for left < right && !unicode.IsLetter(result[left]) && result[left] != '?' {
			left++
		}
		// Skip non-alphabetic characters on the right
		for right > left && !unicode.IsLetter(result[right]) && result[right] != '?' {
			right--
		}

		// Check and handle mismatches or replacements
		if result[left] != result[right] {
			if result[left] == '?' {
				// Replace '?' on the left with the character on the right
				result[left] = result[right]
			} else if result[right] == '?' {
				// Replace '?' on the right with the character on the left
				result[right] = result[left]
			} else {
				// If there's a mismatch and it's not possible to form a palindrome, return "no"
				return strings.Repeat("no", n/2) + strings.Repeat("n", n%2)
			}
		}

		left++
		right--
	}

	// Convert rune slice back to string
	return string(result)
}

func main() {
	// Test cases based on provided examples
	fmt.Println(solutionc("a?-b=BA"))                     // should return "ab-b=ba"
	fmt.Println(solutionc("?+B?b+--a"))                   // should return "a+bab+--a"
	fmt.Println(solutionc("?+cd+a"))                      // should return "nonono"
	fmt.Println(solutionc("?kayak?"))                     // should return "akayaka"
	fmt.Println(solutionc("A-man-a-plan-a-canal-Panama")) // should return "a-man-a-plan-a-canal-panam"
	fmt.Println(solutionc("a1b-B2A"))                     // should return "a-man-a-plan-a-canal-panam"
	fmt.Println(solutionc("a1b-B1A"))                     // should return "a-man-a-plan-a-canal-panam"
	fmt.Println(solutionc("a111A"))
}
