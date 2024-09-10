from math import sqrt

while True:
    try:
        R1, X1, Y1, R2, X2, Y2 = map(int, input().split())
    except EOFError:
        break
    
    if R1 >=  sqrt((X1 - X2) ** 2 + (Y1 - Y2) ** 2) + R2: print('RICO')
    else: print('MORTO')