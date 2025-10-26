package main

import (
	"fmt"
	"strings"
	"unicode"
)

func main() {
	fmt.Println(praSolution("?ab??a"))
	fmt.Println(praSolution("bab??a"))
	fmt.Println(praSolution("?a?"))
	fmt.Println(praSolution("a?"))
	fmt.Println(praSolution("kayak"))
	fmt.Println(praSolution("a?-b=BA"))
	fmt.Println(praSolution("?+B?b+--a"))
	fmt.Println(praSolution("?+cd+a"))
	fmt.Println(praSolution("A-man-a-plan-a-canal-Panama"))
	fmt.Println(praSolution("a"))
	fmt.Println(praSolution("?kayak?"))

}

func praSolution(s string) string {
	s = strings.ToLower(s)
	newString := []rune(s)
	length := len(s)

	left := 0
	right := length - 1

	for left <= right {

		leftChar := newString[left]
		rightChar := newString[right]

		if unicode.IsLetter(leftChar) == false && leftChar != '?' {
			left++
			continue
		}

		if unicode.IsLetter(rightChar) == false && rightChar != '?' {
			right--
			continue
		}

		if leftChar == '?' && rightChar == '?' {
			newString[left] = 'a'
			newString[right] = 'a'
		} else if leftChar == '?' {
			newString[left] = newString[right]
		} else if rightChar == '?' {
			newString[right] = newString[left]
		} else if rightChar != leftChar {
			return "NO"
		}
		left++
		right--
	}

	return string(newString)
}
