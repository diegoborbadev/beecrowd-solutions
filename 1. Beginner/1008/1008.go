package main

import (
	"fmt"
)

func main() {
	var n int
	var m, s float64

	fmt.Scanf("%d\n%f\n%f", &n, &m, &s)

	fmt.Printf("NUMBER = %d\nSALARY = U$ %.2f\n", n, m * s)
}