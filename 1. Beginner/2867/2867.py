import math

for i in range(int(input())):
    n, m = map(int, input().split())
    print(math.floor(math.log10(n ** m)) + 1)