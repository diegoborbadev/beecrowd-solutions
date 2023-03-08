#include <stdio.h>

int main() {
    float a, b, c;
    scanf("%f %f %f", &a, &b, &c);
    
    printf("MEDIA = %.1f\n", (a * 2 + b * 3 + c * 5) / 10);
    return 0;
}