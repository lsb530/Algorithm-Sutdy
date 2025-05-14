package main

func solution(num_list []int) []int {
	var a int = num_list[len(num_list)-2:][0] // n - 1
	var b int = num_list[len(num_list)-2:][1] // n
	answer := make([]int, len(num_list)+1)
	for i, x := range num_list {
		answer[i] = x
	}
	if b > a {
		answer[len(answer)-1] = b - a
	} else {
		answer[len(answer)-1] = b * 2
	}
	return answer
}
func main() {
	solution([]int{2, 1, 6})
	solution([]int{5, 2, 1, 7, 5})
}
