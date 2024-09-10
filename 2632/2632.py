from math import sqrt

tipo = {
    'fire': {'dmg': 200, 'n1': 20, 'n2': 30, 'n3': 50},
    'water': {'dmg': 300, 'n1': 10, 'n2': 25, 'n3': 40},
    'earth': {'dmg': 400, 'n1': 25, 'n2': 55, 'n3': 70},
    'air': {'dmg': 100, 'n1': 18, 'n2': 38, 'n3': 60}
}

for g in range(int(input())):
    w, h, x, h = map(int, input().split())
    e = input().split()
    n, cx, cy = map(int, e[1:])

    enum = tipo[e[0]]
    dmg = enum['dmg']
    ns = 'n' + str(n)
    r = enum[ns]
    proc = True

    if x <= cx <= x + w and h <= cy <= h + h:
        proc = False

    if proc:
        c1 = (h - cy) ** 2
        c2 = (h + h - cy) ** 2
        r2 = r ** 2
        
        for px in range(x, x + w + 1):
            d1 = (px - cx) ** 2 + c1
            d2 = (px - cx) ** 2 + c2
            if r2 >= d1 or r2 >= d2:
                proc = False
                break
        
        if proc:
            c1 = (x - cx) ** 2
            c2 = (x + w - cx) ** 2
            
            for py in range(h, h + h + 1):
                d1 = c1 + (py - cy) ** 2
                d2 = c2 + (py - cy) ** 2
                
                if r2 >= d1 or r2 >= d2:
                    proc = False
                    break

    if proc:
        print(0)
    else:
        print(dmg)