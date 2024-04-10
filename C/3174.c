#include <stdio.h>
#include <string.h>

#define TAM 30

int main() {
    int n, h, b = 0, a = 0, m = 0, d = 0;
    char e[TAM], g[TAM];
    
    scanf("%d ", &n);
    
    while (n--) {
        scanf("%s %s %d", e, g, &h);
        if (!strcmp(g, "bonecos"))
            b += h;
        else if (!strcmp(g, "arquitetos"))
            a += h;
        else if (!strcmp(g, "musicos"))
            m += h;
        else
            d += h;
    }
    
    printf("%d\n", b/8 + a/4 + m/6 + d/12);

    return 0;
}