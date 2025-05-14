package main

import (
	"fmt"
	"unicode"
)

func main() {
	var s1 string
	fmt.Scan(&s1)
	for _, c := range s1 {
		switch {
		case unicode.IsUpper(c):
			fmt.Printf("%c", unicode.ToLower(c))
		case unicode.IsLower(c):
			fmt.Printf("%c", unicode.ToUpper(c))
		default:
			fmt.Printf("%c", c)
		}
	}
	fmt.Println()
}
