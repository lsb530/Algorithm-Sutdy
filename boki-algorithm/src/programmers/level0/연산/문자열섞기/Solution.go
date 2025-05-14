package main

func solution(str1 string, str2 string) string {
	answer := ""
	for i := 0; i < len(str1); i++ {
		s1 := string(str1[i])
		s2 := string(str2[i])
		answer += s1 + s2
	}
	return answer
}
