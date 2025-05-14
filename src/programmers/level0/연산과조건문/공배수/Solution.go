package main

import "fmt"

func solution(number int, n int, m int) int {
	if number%n == 0 && number%m == 0 {
		return 1
	}
	return 0
}

func main() {
	fmt.Println(solution(60, 2, 3))
}
