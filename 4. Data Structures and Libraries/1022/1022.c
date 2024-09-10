#include <stdio.h>
#include <stdlib.h>

int mdc(int a, int b) {
    if (b == 0) return a;
    return mdc(b, a % b);
}

int main() {
    int N, n1, d1, n2, d2, num, den, div;
    char oper;

    scanf("%d", &N);

    while (N-- > 0) {
        scanf("%d / %d %c %d / %d", &n1, &d1, &oper, &n2, &d2);

        switch (oper) {
        case '+':
            num = (n1 * d2 + n2 * d1);
            den = (d1 * d2);
            break;
        case '-':
            num = (n1 * d2 - n2 * d1);
            den = (d1 * d2);
            break;
        case '*':
            num = (n1 * n2);
            den = (d1 * d2);
            break;
        case '/':
            num = (n1 * d2);
            den = (n2 * d1);
            break;
        default:
            continue;
        }

        div = mdc(abs(num), abs(den));

        if (den < 0) {
            num = -num;
            den = -den;
        }

        printf("%d/%d = %d/%d\n", num, den, num / div, den / div);
    }

    return 0;
}