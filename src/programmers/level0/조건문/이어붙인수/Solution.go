package main

import "fmt"

func solution(num_list []int) int {
	even := 0
	odd := 0
	for _, num := range num_list {
		if num%2 == 0 {
			even = even*10 + num // 8
		} else {
			odd = odd*10 + num // 5 -> 50+7=57 -> 570+3=573
		}
	}
	return even + odd
}
func main() {
	fmt.Println(solution([]int{3, 4, 5, 2, 1}))
	fmt.Println(solution([]int{5, 7, 8, 3}))
}
