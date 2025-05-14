package main

func solution(a int, d int, included []bool) int {
	answer := 0
	for i, include := range included {
		if include {
			answer += d*i + a
		}
	}
	return answer
}
