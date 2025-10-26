package main

import "fmt"

func main() {

	input := "lleettzcode"
	fmt.Println(createLetterMap(input))
	mp := createLetterMap(input)

	a := []rune(input)

	for i := 0; i < len(input); i++ {
		l, ok := mp[string(a[i])]
		if ok && l == 1 {
			fmt.Println(string(a[i]))
			break
		}
	}

}

func createLetterMap(input string) map[string]int {

	mp := map[string]int{}

	a := []rune(input)

	for i := 0; i < len(input); i++ {
		l, ok := mp[string(a[i])]

		if ok && mp[string(a[i])] != 0 {
			mp[string(a[i])] = l + 1
		} else {
			mp[string(a[i])] = 1
		}
	}

	return mp
}
