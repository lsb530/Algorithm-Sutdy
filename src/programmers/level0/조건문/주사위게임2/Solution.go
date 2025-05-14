package main

import (
	"fmt"
	"math"
)

func Calculate(cnt int, list []int) int {
	sum := 0
	squareSum := 0
	cubeSum := 0
	for _, x := range list {
		sum += x
		squareSum += int(math.Pow(float64(x), 2))
		cubeSum += int(math.Pow(float64(x), 3))
	}
	switch cnt {
	case 1:
		return sum * squareSum * cubeSum
	case 2:
		return sum * squareSum
	case 3:
		return sum
	}
	return 0
}

func solution(a int, b int, c int) int {
	calcMap := make(map[int]int)
	calcMap[a] = a
	calcMap[b] = b
	calcMap[c] = c

	list := make([]int, 0, 3)
	list = append(list, a)
	list = append(list, b)
	list = append(list, c)

	return Calculate(len(calcMap), list)
}

func main() {
	x := solution(2, 6, 1)
	fmt.Println(x)
	y := solution(5, 3, 3)
	fmt.Println(y)
	z := solution(4, 4, 4)
	fmt.Println(z)
}
