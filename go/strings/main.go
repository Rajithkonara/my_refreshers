package main

import "fmt"

func main() {

	//index expressions
	var s string = "Rajith konara"
	var b byte = s[5]

	fmt.Println(b)

	//slice expression with strings

	var name string = "Rajith konara"
	var s2 string = name[4:7]
	var s3 string = name[:5]
	var s4 string = name[6:]

	fmt.Println(s2)
	fmt.Println(s3)
	fmt.Println(s4)

	var by byte = 'y'
	var fb string = string(by)
	fmt.Println(fb)
}
