#include <stdio.h>
#include <math.h>

int main() {
    double n, r;
    scanf("%lf", &n);
    
    r = 3.14159 * pow(n, 2);
    printf("A=%.4f\n", r);

    return 0;
}