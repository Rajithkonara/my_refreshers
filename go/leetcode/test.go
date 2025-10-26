package main

import (
	"fmt"
	"strings"
	"unicode"
)

func main() {

	fmt.Println(sol2("?kayak?")) // should return "akayaka"
	fmt.Println(sol2("?ab??a"))  // should return "a"
	fmt.Println(sol2("bab??a"))  // should return "a"
	fmt.Println(sol2("?a?"))     // should return "a"
	fmt.Println(sol2("a?"))      // should return "a"
	fmt.Println(sol2("?"))       // should return "kayak"
	fmt.Println(sol2("a"))       // should return "kayak"

}

func sol2(s string) string {
	size := len(s)
	newString := []rune(s)
	left := 0
	right := size - 1

	for left <= right {
		leftChar := newString[left]
		rightChar := newString[right]

		if leftChar == '?' && rightChar == '?' {
			newString[left] = 'a'
			newString[right] = 'a'
		} else if leftChar == '?' {
			newString[left] = rightChar
		} else if rightChar == '?' {
			newString[right] = leftChar
		} else if leftChar != rightChar {
			return "NO"
		}
		left++
		right--
	}

	return string(newString)
}

func solutiosssn(s string) string {

	no := false
	out := []rune(s)
	left, right := 0, len(s)-1
	for left < right {
		if out[left] == '?' && !unicode.IsLetter(out[left]) {
			left++
			continue
		}

		if out[left] == '?' && !unicode.IsLetter(out[right]) {
			right--
			continue
		}

		if strings.ToLower(string(out[left])) != strings.ToLower(string(out[right])) {
			if out[left] == '?' {
				out[left] = out[right]
			} else if out[right] == '?' {
				out[right] = out[left]
			} else {
				no = true
				break
			}
		}

		if out[left] == '?' && out[right] == '?' {
			out[left] = 97
			out[right] = 97
		}

		left++
		right--
	}

	if no {
		noOut := ""
		for i := 0; i < len(s); i += 2 {
			noOut += "no"
		}

		return noOut
	}

	return string(out)
}
