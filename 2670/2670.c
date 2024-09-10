#include <stdio.h>

int main (){

	unsigned short a1, a2, a3;
	unsigned short i, m;
	short l[3];

	scanf("%hu %hu %hu", &a1, &a2, &a3);

	l[0] = a2*2 + a3*4;
	l[1] = a1*2 + a3*2;
	l[2] = a1*4 + a2*2;

	m = l[0];
    for (i = 0; i < 3; i++)
    {
        m = l[i] < m ? l[i] : m;
    }

	printf("%hu\n", m);
    return 0;
}