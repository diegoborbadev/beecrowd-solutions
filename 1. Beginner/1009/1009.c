#include <stdio.h>

int main() {
    char a;
    float n, m;

    scanf("%s",&a);
    scanf("%f %f", &n, &m);
    
    printf("TOTAL = R$ %.2f\n",(n+m * 0.15));
    return 0;
}