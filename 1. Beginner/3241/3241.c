#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    getchar();

    for (int i = 0; i < n; i++) {
        char s[100];
        fgets(s, sizeof(s), stdin);
        s[strcspn(s, "\n")] = 0;

        if (strcmp(s, "P=NP") == 0) {
            printf("skipped\n");
        } else {
            int a, b;
            sscanf(s, "%d+%d", &a, &b);
            printf("%d\n", a + b);
        }
    }
    return 0;
}