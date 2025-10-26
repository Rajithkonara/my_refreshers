package main

import "fmt"

func main() {

	messages := []string{"Hello", "Hola", "नमस्कार", "こんにちは", "Привіт"}

	y := messages[:2]
	x := messages[1:4]
	z := messages[3:5]

	fmt.Println(messages)
	fmt.Println(y)
	fmt.Println(x)
	fmt.Println(z)

	amount := 6
	double(amount)
	fmt.Println(amount)

	array := [5]int{1, 2, 3, 4, 5}
	slice1 := array[1:4] // slice1 references elements {2, 3, 4} in array
	slice2 := array[2:5] // slice2 references elements {3, 4, 5} in array

	fmt.Println(slice1) // Output: [2 3 4]
	fmt.Println(slice2) // Output: [3 4 5]

	slice1[1] = 99      // Modify the shared element (3)
	fmt.Println(array)  // Output: [1 2 99 4 5]
	fmt.Println(slice2) // Output: [99 4 5] (affected by change in slice1)

}

func double(num int) int {
	return num * 2
}
