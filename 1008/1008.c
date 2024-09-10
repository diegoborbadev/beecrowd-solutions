#include <stdio.h>

int main() {
    int n, m;
    float s;
    scanf("%d %d %f", &n, &m, &s);
    
    printf("NUMBER = %d\nSALARY = U$ %.2f\n", n, m *s);
    return 0;
}