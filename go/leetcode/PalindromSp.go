package main

import (
	"fmt"
	"strings"
)

func solution(s string) string {
	s = strings.ToLower(s)
	n := len(s)
	newString := []rune(s)

	left, right := 0, n-1

	for left <= right {
		leftChar := newString[left]
		rightChar := newString[right]
		if leftChar == '?' && rightChar == '?' {
			// Both sides are '?', choose 'a' or any other character
			newString[left] = 'a'
			newString[right] = 'a'
		} else if leftChar == '?' {
			// Replace the left '?' with the right character
			newString[left] = rightChar
		} else if rightChar == '?' {
			// Replace the right '?' with the left character
			newString[right] = leftChar
		} else if leftChar != rightChar {
			// Characters don't match and aren't '?', so it's not a palindrome
			return "NO"
		}

		left++
		right--
	}

	return string(newString)
}

func main() {
	fmt.Println(solution("?a?"))
	fmt.Println(solution("a?a"))
	fmt.Println(solution("?ab??a")) // should return "aaa" or "zaz"
	fmt.Println(solution("bab??a")) // should return "aaa" or "zaz"
	fmt.Println(solution("?"))      // should return "aaa" or "zaz"

}
