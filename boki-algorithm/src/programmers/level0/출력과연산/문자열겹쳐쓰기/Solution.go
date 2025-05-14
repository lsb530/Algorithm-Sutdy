package main

//func solution(my_string string, overwrite_string string, s int) string {
//	var result string = ""
//	for i := 0; i < s; i++ {
//		result += string(my_string[i])
//	}
//	result += overwrite_string
//	for i := len(result); i < len(my_string); i++ {
//		result += string(my_string[i])
//	}
//	return result
//}

func solution(my_string string, overwrite_string string, s int) string {
	return my_string[:s] + overwrite_string + my_string[s+len(overwrite_string):]
}
