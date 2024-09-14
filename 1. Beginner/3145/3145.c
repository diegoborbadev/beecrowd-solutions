#include <stdio.h>
#include <math.h>

int main() {
    double n, x, r;
    scanf("%lf %lf", &n, &x);
    
    printf("%.2f\n", x / (n + 2));

    return 0;
}