package main

import "fmt"

func main() {
	var jon, doc string
	fmt.Scanln(&jon)
	fmt.Scanln(&doc)

	if len(jon) >= len(doc) {
		fmt.Println("go")
	} else {
		fmt.Println("no")
	}
}
