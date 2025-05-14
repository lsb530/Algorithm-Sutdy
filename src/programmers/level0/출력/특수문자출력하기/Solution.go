package main

import "fmt"

func main() {
	//s := "!@#$%^&*(\\'\"<>?:;" // 일반 문자열 리터럴
	s := `!@#$%^&*(\'"<>?:;` // Raw 문자열 리터럴
	fmt.Println(s)
}
