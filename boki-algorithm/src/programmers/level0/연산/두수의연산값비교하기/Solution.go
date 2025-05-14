package main

import (
	"strconv"
)

func solution(a int, b int) int {
	x, _ := strconv.Atoi(strconv.Itoa(a) + strconv.Itoa(b))
	y := 2 * a * b
	if x >= y {
		return x
	}
	return y
}
