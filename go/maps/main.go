package main

import "fmt"

func main() {

	mp := map[string]int{}
	mp["A"] = 1
	mp["B"] = 1

	fmt.Println(mp["A"])

	//check key exists

	v, ok := mp["A"]
	fmt.Println(v, ok)

	//using a set as a map
	intSet := map[int]bool{}
	vals := []int{5, 10, 2, 5, 8, 7, 3, 9, 1, 2, 10}
	for _, v := range vals {
		intSet[v] = true
	}
	fmt.Println(len(vals), len(intSet))
	fmt.Println(intSet[5])
	fmt.Println(intSet[500])
	if intSet[100] {
		fmt.Println("100 is in the set")
	}
}
