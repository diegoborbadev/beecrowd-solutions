n = int(input())

for _ in range(n):
    x, y = map(int, input().split())

    contador = 0
    while(x >= y):
        contador += 1
        x -= y

    print(contador + x)