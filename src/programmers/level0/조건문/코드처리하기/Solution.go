package main

import (
	"fmt"
)

func solution(code string) string {
	answer := ""
	mode := 0
	for i := 0; i < len(code); i++ {
		if code[i] == '1' {
			mode = (mode + 1) % 2
		} else {
			if i%2 == mode {
				answer += string(code[i])
			}
		}
	}
	if len(answer) == 0 {
		return "EMPTY"
	}
	return answer
}

func main() {
	fmt.Println(solution("abc1abc1abc"))
}
