package main

import "fmt"

var person struct {
	name string
	age  int
	pet  string
}

func main() {
	person.name = "bob"
	person.age = 50
	person.pet = "dog"

	pet := struct {
		name string
		kind string
	}{
		name: "Fido",
		kind: "dog",
	}

	fmt.Println(pet)
	fmt.Println(person)
}
