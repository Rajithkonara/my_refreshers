package main

import "fmt"

func main() {

	xArray := [4]int{1, 2, 3, 4}

	xSlice := xArray[:]

	fmt.Println(xSlice)

	//You can also convert a subset of an array into a slice:

	//x := [4]int{5, 6, 7, 8}
	//y := x[:2]
	//z := x[2:]
	//fmt.Println(y)
	//fmt.Println(z)

	//slice from array share same pointer
	x := [4]int{5, 6, 7, 8}
	y := x[:2]
	z := x[2:]
	x[0] = 10
	fmt.Println("x:", x)
	fmt.Println("y:", y)
	fmt.Println("z:", z)

	//converting slice to array
	//When you convert a slice to an array, the data in the slice is copied to new memory.
	//That means that changes to the slice won’t affect the array, and vice-versa.

	xxSlice := []int{1, 2, 3, 4}
	xArrayPointer := (*[4]int)(xxSlice)

	xxSlice[0] = 10
	xArrayPointer[1] = 20
	fmt.Println(xxSlice)       // prints [10 20 3 4]
	fmt.Println(xArrayPointer) // prints &[10 20 3 4]

	fmt.Printf("length is %d", len(xSlice))

}
