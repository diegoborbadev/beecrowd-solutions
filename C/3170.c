#include <stdio.h>

int main() {
    int n, m, r;
    scanf("%d %d", &n, &m);
    r = m/2 - n;

    if (r > 0)
        printf("Faltam %d bolinha(s)\n", r);
    
    else
        printf("Amelia tem todas bolinhas!\n");

    return 0;
}