#include <stdio.h>

int main() {
    double a, b;
    
    scanf("%lf %lf", &a, &b);

    printf("%.3f\n", (a * b)/12);
    
    return 0;
}