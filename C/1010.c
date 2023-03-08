#include <stdio.h>

int main() {
    int c1, c2, n1, n2;
    float m1, m2;

    scanf("%d %d %f", &c1, &n1, &m1);
    scanf("%d %d %f", &c2, &n2, &m2);
    
    printf("VALOR A PAGAR: R$ %.2f\n", (n1 * m1) + (n2 * m2));
    return 0;
}