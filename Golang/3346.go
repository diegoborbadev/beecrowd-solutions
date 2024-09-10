package main

import "fmt"

func main() {
	var f1, f2 float64

	fmt.Scanf("%f %f", &f1, &f2)

	ft := ((1 + f1/100) * (1 + f2/100) - 1) * 100

	fmt.Printf("%.6f\n", ft)
}