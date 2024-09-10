#include <stdio.h>
#include <string.h>

int main() {
    char j[1000], d[1000];
    scanf("%s %s", j, d);
    
    if (strlen(j) >= strlen(d)) {
        printf("go\n");
    } else {
        printf("no\n");
    }
    
    return 0;
}