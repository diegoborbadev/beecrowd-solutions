#include <stdio.h>

int main() {
    int h1, m1, h2, m2, t, h, m;

    scanf("%d %d %d %d", &h1, &m1, &h2, &m2);

    if (h2 <= h1 && m2 <= m1) {
        h2 = h2 + 24;
    
    } else if (m2 <= m1) {    
        m2 = m2 + 60;
        h2 = h2 - 1;
    } 

    t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60));
    h = t / 3600;
    m = (t - (h * 3600)) / 60;
    
    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m);
    return 0;
}