package main

import "fmt"

func solution(num_list []int) int {
	sum := 0
	mul := 1
	for _, x := range num_list {
		sum += x
		mul *= x
	}
	if mul < sum*sum {
		return 1
	}
	return 0
}

func main() {
	fmt.Println(solution([]int{3, 4, 5, 2, 1}))
	fmt.Println(solution([]int{5, 7, 8, 3}))
}
