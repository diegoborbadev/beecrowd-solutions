package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	input := scanner.Text()

	var g, e int

	l := strings.Split(input, " ")
	for i := 0; i < len(l); i++ {
		item, _ := strconv.Atoi(l[i])
		if i > 2 && i < 5 {
			e += item
		} else {
			g += item
		}
	}

	if g > e {
		fmt.Println("Middle-earth is safe.")
	} else {
		fmt.Println("Sauron has returned.")
	}
}
