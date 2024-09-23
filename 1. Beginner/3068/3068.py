count = 1

while True:
    x1, y1, x2, y2 = map(int, input().split())
    
    if x1 == 0 and x2 == 0 and y1 == 0 and y2 == 0:
        break

    t = 0
    n = int(input())
    for _ in range(n):
        m1, m2 = map(int, input().split())
        if x1 <= m1 <= x2 and y2 <= m2 <= y1:
            t += 1

    print(f"Teste {count}")
    print(t)
    count += 1