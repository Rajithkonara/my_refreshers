package main

import (
	"fmt"
	"strings"
	"unicode"
)

func solution2(s string) string {

	// Convert the string to lowercase
	SLower := strings.ToLower(s)
	n := len(SLower)
	result := []rune(SLower)
	left, right := 0, n-1

	for left <= right {
		// Skip non-alphanumeric characters
		if result[left] != '?' && !unicode.IsLetter(result[left]) {
			left++
			continue
		}
		if result[left] != '?' && !unicode.IsLetter(result[right]) {
			right--
			continue
		}

		// Case when both characters are the same or both are '?'
		if result[left] == result[right] {
			if result[left] == '?' {
				result[left] = 'a'
				result[right] = 'a'
			}
		} else if result[left] == '?' && unicode.IsLetter(result[right]) {
			// Replace '?' on the left with the right character
			result[left] = result[right]
		} else if result[right] == '?' && unicode.IsLetter(result[left]) {
			// Replace '?' on the right with the left character
			result[right] = result[left]
		} else {
			// If a palindrome cannot be formed
			return strings.Repeat("no", n/2) + strings.Repeat("n", n%2)
		}

		left++
		right--
	}

	return string(result)

}

func main() {
	fmt.Println(solution2("a?-b=BA"))                     // should return "ab-b=ba"
	fmt.Println(solution2("?+B?b+--a"))                   // should return "a+bab+--a"
	fmt.Println(solution2("?+cd+a"))                      // should return "nonono"
	fmt.Println(solution2("?kayak?"))                     // should return "akayaka"
	fmt.Println(solution2("A-man-a-plan-a-canal-Panama")) // should return "a-man-a-plan-a-canal-panam"
	fmt.Println(solution2("mom"))                         // should return "a-man-a-plan-a-canal-panam"
	//fmt.Println(solution2("a1b-B22A"))                    // should return "a-man-a-plan-a-canal-panam"
	//fmt.Println(solution2("a111A"))                       // should return "a-man-a-plan-a-canal-panam"
}
