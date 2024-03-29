package main

import (
	"fmt"
)

func main() {
	var r, v float64

	fmt.Scanf("%f", &r)
	v = (4 / 3.0) * 3.14159 * r * r * r

	fmt.Printf("VOLUME = %.3f\n", v)
}
