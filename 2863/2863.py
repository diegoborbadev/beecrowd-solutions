while True:
    try:
        n = int(input())

        r = 12
        for i in range(n):
            m = float(input())
            if m < r: r = m

        print(r)    
    except EOFError:
        break