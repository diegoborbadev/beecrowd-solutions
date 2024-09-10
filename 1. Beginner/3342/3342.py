n = int(input())

t = n * n
w = b = t // 2

if(not(n%2 == 0)):
    w += 1

print(f'{w} casas brancas e {b} casas pretas')