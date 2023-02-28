from math import floor, log10, pi, e

n = int(input())
print(floor(n*log10(n/e) + log10(2*pi*n)/2.0) + 1);    