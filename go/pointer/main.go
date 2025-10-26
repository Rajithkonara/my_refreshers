package main

func main() {
	amount := 6
	double(&amount)
	println(amount)
}

func double(num *int) int {
	*num = *num * 2
	return *num
}
