#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int calls = 0, aux = 0;
int fib(int num) {
    calls++;
    if (num == 0) {
        return 0;
    }
    else if (num == 1) {
        aux++;
        return 1;
    }
    else {
        return (fib(num - 1) + fib(num - 2));
    }
}

main() {
    int qnt, num, i, j;
    scanf("%d", &qnt);
    for (i = 0; i < qnt; i++) {
        calls = 0;
        aux = 0;
        scanf("%d", &num);
        j = fib(num);
        printf("fib(%d) = %d calls = %d\n", num, calls - 1, aux);
    }
    system("pause");
}