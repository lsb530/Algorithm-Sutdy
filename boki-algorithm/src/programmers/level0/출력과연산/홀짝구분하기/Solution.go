package main

import "fmt"

func main() {
	var a int
	fmt.Scan(&a)
	isEven := a%2 == 0
	if isEven {
		fmt.Printf("%d is even\n", a)
	} else {
		fmt.Printf("%d is odd\n", a)
	}
}
