package main

import "fmt"

func solution(arr []string) string {
	var result string
	for _, s := range arr {
		result += s
	}
	return result
}

func main() {
	arr := []string{"a", "b", "c"}
	fmt.Println(solution(arr))
}
