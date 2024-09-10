import math

v, n = map(int, input().split())
x = v * n

r = ""
for i in range(10, 100, 10):
    r+= str(math.ceil(x/(100/i)))
    if(i < 90):
        r+= " "

print(r)