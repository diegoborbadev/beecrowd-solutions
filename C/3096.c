#include <stdio.h>
#include <math.h>

int main(){
    int n, r;

    scanf("%d", &n);      //Beecrownd dont recongnize M_PI and M_E
    r = floor(n*log10(n/2.71828182845904523536) + log10(2*3.14159265358979323846*n)/2.0) + 1;

    printf("%d\n", r);
    return 0;   
}