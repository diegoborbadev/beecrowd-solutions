#include <stdio.h>

int main() {
    int h, e, a, o, w, x;
    scanf("%d %d %d %d %d %d", &h, &e, &a, &o, &w, &x);
    
    if (h + e + a + x >= o + w) {
        printf("Middle-earth is safe.\n");
    } else {
        printf("Sauron has returned.\n");
    }

    return 0;
}