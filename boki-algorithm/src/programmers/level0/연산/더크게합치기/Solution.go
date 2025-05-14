package main

import "strconv"

func solution(a int, b int) int {
	x, _ := strconv.Atoi(strconv.Itoa(a) + strconv.Itoa(b))
	y, _ := strconv.Atoi(strconv.Itoa(b) + strconv.Itoa(a))
	if x > y || x == y {
		return x
	}
	return y
}
