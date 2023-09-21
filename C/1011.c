#include <stdio.h>
#include <math.h>

int main() {
    double x;
     
    scanf("%lf", &x);

    printf("VOLUME = %.3f\n", (4 / 3.0) * 3.14159 * pow(x, 3));

    return 0;
}