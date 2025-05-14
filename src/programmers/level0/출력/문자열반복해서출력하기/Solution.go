package main

import "fmt"

func main() {
	s := ""
	n := 0
	fmt.Scan(&s, &n)
	for i := 0; i < n; i++ {
		fmt.Printf("%s", s)
	}
}
