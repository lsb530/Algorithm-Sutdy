package main

import "fmt"

func solution(my_string string, k int) string {
	result := ""
	for i := 0; i < k; i++ {
		result += my_string
	}
	return result
}

func main() {
	fmt.Println(solution("love", 3))
}
