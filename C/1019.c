#include "stdio.h"

int main () {
 	unsigned int sec;
 	unsigned char h, m;

  	scanf("%d", &sec);
  	
    h = sec / 3600;
  	sec -= h * 3600;
  	
    m = sec / 60;
  	sec -= m * 60;

  	printf("%d:%d:%d\n",h, m, sec);
}