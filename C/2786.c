#include <stdio.h>
 
int main() { 
    int l, c;

    scanf("%d %d", &l, &c);
    
    printf("%d\n", (l * c) + ((l - 1) * (c - 1)));
    printf("%d\n", ((l - 1) * 2) + ((c - 1) * 2));
    return 0;
}