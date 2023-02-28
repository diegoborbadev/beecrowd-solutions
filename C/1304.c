#include <stdio.h>

int main(){
    int h, m, s;
    int tt = 0;
    int t;
    double d = 0;
    int vel;
    char c;
    
    while(scanf("%d:%d:%d", &h, &m, &s) != EOF){
        scanf("%c", &c);
        
        if(c == ' '){
            if(tt != 0) d += (double)(((h*3600 + m*60 + s)-tt)*vel)/3600;
            
            scanf("%d%*c", &vel);
            tt = h*3600 + m*60 + s;
        
        }else{
            d += (double)(((h*3600 + m*60 + s)-tt)*vel)/3600;
            printf("%02d:%02d:%02d %.2lf km\n", h, m, s, d);
            tt = h*360 + m*60 + s;
        }
    }
    return 0;
}