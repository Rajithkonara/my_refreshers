package main

import (
	"fmt"
	"strconv"
	"time"
)

func main() {

	fmt.Println(Solution(-5000))
	fmt.Println(Solution(15958))
	fmt.Println(Solution(-5859))

}
func Solution(N int) int {

	fmt.Println("time  ", time.Now().Format("2006-0102T15:04:05.000Z"))

	var max int
	var str = strconv.Itoa(N)

	for i := 0; i < len(str); i++ {

		if string(str[i]) == "5" {
			var temp string

			temp = str[0:i] + str[i+1:]
			num, _ := strconv.Atoi(temp)

			switch {

			case N > 0: // For positive numbers
				if num > max {
					max = num
				}
			case N < 0: // For negative numbers
				if num > N {
					max = num

				}
			}

		}
	}

	return max
}
