for _ in range(int(input())):
    r = g = b = 0
    for _ in range(int(input())):
        a, d = input().split()
        if a == 'R' and d == 'B': r += 1
        elif a == 'R' and d == 'G': r += 2
        elif a == 'G' and d == 'R': g += 1
        elif a == 'G' and d == 'B': g += 2
        elif a == 'B' and d == 'G': b += 1
        elif a == 'B' and d == 'R': b += 2
    
    if (r > g and r > b) or (g > r and g > b) or (b > r and b > g):
        m = max(r, g, b)
        if m == r: print('red')
        elif m == g: print('green')
        elif m == b: print('blue')
    elif r == g == b:
        print('trempate')
    else:
        print('empate')