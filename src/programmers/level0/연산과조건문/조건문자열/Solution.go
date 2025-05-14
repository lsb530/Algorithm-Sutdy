package main

import (
	"fmt"
)

func solution(ineq string, eq string, n int, m int) int {

	judge := func(statement bool) int {
		if statement {
			return 1
		}
		return 0
	}

	switch ineq + eq {
	case "<=":
		return judge(n <= m)
	case "<!":
		return judge(n < m)
	case ">=":
		return judge(n >= m)
	case ">!":
		return judge(n > m)
	default:
		return -1
	}
}
func main() {
	fmt.Println(solution("<", "=", 20, 50))
	fmt.Println(solution(">", "!", 41, 78))
}
