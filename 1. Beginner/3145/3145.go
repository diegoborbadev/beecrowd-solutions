package main

import (
	"fmt"
)

func main() {
	var n, x float64

	fmt.Scanf("%f %f", &n, &x)

	fmt.Printf("%.2f\n", x / (n + 2))
}
