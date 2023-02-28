#include <stdio.h>
#include <math.h>

int main(){
    
    int n,i;
    long long int m;
    double d, r;
    
    scanf("%d", &n);
    
    for(i = 0; i < n; i++){
          scanf("%lld", &m);
          
          //Baskara (a = 1, b= 1, c= -2m)
          r = (-1 + sqrt(1 + 8 * m))/2;
          
          printf("%lld\n", (long long int) r);
    }
    
    return 0;
}