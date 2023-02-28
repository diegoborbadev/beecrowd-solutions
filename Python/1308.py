import math

n = int(input())

for i in range(n):
    m = int(input())
    
    #Baskara (a = 1, b= 1, c= -2m)
    r = (-1 + math.sqrt(1 + 8 * m)) / 2
    
    print(int(r))