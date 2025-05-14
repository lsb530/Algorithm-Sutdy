package main

import "fmt"

func main() {
	var s1 string
	fmt.Scan(&s1)
	for _, c := range s1 {
		//fmt.Printf("%c\n", c)
		fmt.Println(string(c))
	}
}
