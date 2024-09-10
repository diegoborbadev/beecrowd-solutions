package main

import (
	"fmt"
	"math"
)

func main() {
	var n int

	fmt.Scanf("%d", &n)

	m := float64(n)
	r := math.Floor(m*math.Log10(m/math.E)+math.Log10(2*math.Pi*m)/2.0) + 1

	fmt.Printf("%d\n", int(r))
}
