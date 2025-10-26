package main

import (
	"errors"
	"fmt"
)

type personOptions struct {
	FirstName string
	LastName  string
	Age       int
}

// Named/optional parameters support
func printPerson(p personOptions) {
	println(p.FirstName, p.LastName, p.Age)
}

// Variadic functions support
func addTo(base int, values ...int) []int {
	out := make([]int, 0, len(values))
	for _, v := range values {
		out = append(out, base+v)
	}
	return out
}

// function as variable
func f1(a string) int {
	return len(a)
}

func f2(a string) int {
	total := 0
	for _, v := range a {
		total += int(v)
	}
	return total
}

// avoid blank returns
func divAndRemainder(num, denom int) (result int, remainder int, err error) {
	if denom == 0 {
		err = errors.New("cannot divide by zero")
		return
	}
	result, remainder = num/denom, num%denom
	return
}

// type functions
type opFuncType func(int, int) int

var opMap = map[string]opFuncType{
	"+": func(a, b int) int { return a + b },
}

// Return function from a function
func makeMult(base int) func(int) int {
	return func(factor int) int {
		return base * factor
	}
}

func main() {

	printPerson(personOptions{
		FirstName: "John",
		Age:       30,
	})

	printPerson(personOptions{
		FirstName: "Jane",
		LastName:  "Doe",
	})

	fmt.Println(addTo(3))
	fmt.Println(addTo(3, 2, 4, 6))
	a := []int{1, 2, 3}
	fmt.Println(addTo(3, a...))
	fmt.Println(addTo(3, []int{1, 2, 3, 4, 5, 6}...))

	fmt.Println(divAndRemainder(5, 0))

	// function as variable
	var myFunctionVariable func(string) int
	myFunctionVariable = f1
	result := myFunctionVariable("Hello")
	fmt.Println(result)

	myFunctionVariable = f2
	result = myFunctionVariable("Hello")
	fmt.Println(result)

	//anonymous function
	f := func(j int) {
		fmt.Println("printing", j, "from inside anonymous function")
	}
	for i := 0; i < 5; i++ {
		f(i)
	}

	// inline anonymous function
	for i := 0; i < 5; i++ {
		func(j int) {
			fmt.Println("printing", j, "from inside anonymous function")
		}(i)
	}

	// Return function from a function
	twoBase := makeMult(2)
	threBase := makeMult(3)
	for i := 0; i < 3; i++ {
		fmt.Println(twoBase(i), threBase(i))
	}

}
