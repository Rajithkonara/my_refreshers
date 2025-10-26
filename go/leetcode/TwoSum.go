package main

import "fmt"

func main() {
	//int[] nums = {3, 7, 2, 15};
	//int target = 9;

	xArray := []int{3, 7, 2, 15}
	a, b := twoSum(xArray, 9)
	fmt.Println(a)
	fmt.Println(b)

	//
	c, d := twoSumMap(xArray, 9)
	fmt.Println(c)
	fmt.Println(d)

	e, f := twoSumOneMap(xArray, 9)
	fmt.Println(e)
	fmt.Println(f)

}

func twoSumtest(in []int, target int) (int, int) {

	for x := 0; x < len(in); x++ {

		for y := x; y < len(in); y++ {

			if in[x]-target == in[y] {
				return in[x], in[y]
			}

		}

	}
	return 0, 0

}

func twoSum(a []int, target int) (int, int) {

	for x := 0; x < len(a); x++ {

		for y := x + 1; y < len(a); y++ {

			if a[x]+a[y] == target {
				return a[x], a[y]
			}
		}

	}
	return 0, 0
}

func twoSumMap(a []int, target int) (int, int) {

	mp := map[int]int{}

	for i := 0; i < len(a); i++ {
		mp[a[i]] = i
	}

	for x := 0; x < len(a); x++ {
		key := target - a[x]

		_, ok := mp[key]

		if ok && mp[key] != x {
			return a[x], mp[key]
		}

	}

	return 0, 0

}

// todo: Write with one map
func twoSumOneMap(a []int, target int) (int, int) {

	mp := map[int]int{}

	for x := 0; x < len(a); x++ {

		key := target - a[x]

		_, ok := mp[key]

		if ok && mp[key] != x {
			return mp[key], x
		}

		mp[a[x]] = x

		println("mp[a[x]]", mp[a[x]])
	}

	return 0, 0
}
