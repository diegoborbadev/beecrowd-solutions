while True:
    try:
        n = int(input())
        t = [int(x) for x in input().split()]

        tt = sum(t)
        lt = 0
        
        r = abs(tt - 2 * t[0])

        for i in range(1, len(t)):
            lt += t[i - 1]
            d = abs(tt - 2 * lt)
            if d < r:
                r = d

        print(r)
    except EOFError:
        break