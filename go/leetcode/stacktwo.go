package main

import (
	"fmt"
)

func main() {

	is := stackTwo("()")
	fmt.Println("brackets are", is)
	fmt.Println(stackTwo("(((())))"))
	fmt.Println(stackTwo("(((()))}"))
	fmt.Println(stackTwo("([)]"))
	fmt.Println(stackTwo("{[]}"))
}

func stackTwo(s string) bool {
	var stackRunes []rune
	newString := []rune(s)

	for _, k := range newString {
		if k == '(' || k == '{' || k == '[' {
			stackRunes = append(stackRunes, k)
		}
		if k == ')' || k == '}' || k == ']' {
			if len(stackRunes) == 0 {
				return false
			}
			if k == ')' && stackRunes[len(stackRunes)-1] == '(' {
				stackRunes = stackRunes[:len(stackRunes)-1]
			} else if k == '}' && stackRunes[len(stackRunes)-1] == '{' {
				stackRunes = stackRunes[:len(stackRunes)-1]
			} else if k == ']' && stackRunes[len(stackRunes)-1] == '[' {
				stackRunes = stackRunes[:len(stackRunes)-1]
			} else {
				return false
			}
		}
	}
	fmt.Println(string(stackRunes))
	if len(stackRunes) > 0 {
		return false
	}
	return true
}
