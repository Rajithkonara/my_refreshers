package main

import "fmt"

type myType string

type person struct {
	name string
	age  int
}

func main() {
	value := myType("a value")
	value.sayHi()

	//
	p := person{name: "John", age: 25}
	p.print()

	p.updateAge(30)
	p.print()

}

func (p *person) print() {
	fmt.Printf("%s is %d years old", p.name, p.age)
	fmt.Println()
}

func (m myType) sayHi() {
	print("Hi \n")
}

func (p *person) updateAge(age int) {
	p.age = age
}
