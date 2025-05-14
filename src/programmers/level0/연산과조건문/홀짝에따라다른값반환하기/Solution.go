package main

func solution(n int) int {
	answer := 0
	isEven := n%2 == 0
	start := 0

	if isEven {
		start = 2
	} else {
		start = 1
	}
	for i := start; i <= n; i += 2 {
		if isEven {
			answer += i * i
		} else {
			answer += i
		}
	}

	return answer
}
