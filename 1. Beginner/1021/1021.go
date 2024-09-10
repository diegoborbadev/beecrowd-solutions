package main

import (
	"fmt"
)

func main() {
	var d float64
	fmt.Scan(&d)

	n := int(d)
	m := int((d - float64(n)) * 100)

	fmt.Println("NOTAS:")
	fmt.Printf("%d nota(s) de R$ 100.00\n", n/100)
	n -= (n / 100) * 100

	fmt.Printf("%d nota(s) de R$ 50.00\n", n/50)
	n -= (n / 50) * 50

	fmt.Printf("%d nota(s) de R$ 20.00\n", n/20)
	n -= (n / 20) * 20

	fmt.Printf("%d nota(s) de R$ 10.00\n", n/10)
	n -= (n / 10) * 10

	fmt.Printf("%d nota(s) de R$ 5.00\n", n/5)
	n -= (n / 5) * 5

	fmt.Printf("%d nota(s) de R$ 2.00\n", n/2)
	n -= (n / 2) * 2

	fmt.Println("MOEDAS:")
	fmt.Printf("%d moeda(s) de R$ 1.00\n", n/1)
	n -= n / 1 * 1

	fmt.Printf("%d moeda(s) de R$ 0.50\n", m/50)
	m -= (m / 50) * 50

	fmt.Printf("%d moeda(s) de R$ 0.25\n", m/25)
	m -= (m / 25) * 25

	fmt.Printf("%d moeda(s) de R$ 0.10\n", m/10)
	m -= (m / 10) * 10

	fmt.Printf("%d moeda(s) de R$ 0.05\n", m/5)
	m -= (m / 5) * 5

	fmt.Printf("%d moeda(s) de R$ 0.01\n", m)
}
