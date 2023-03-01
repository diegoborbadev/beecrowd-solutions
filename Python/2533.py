while True:
    try:
        m = int(input())
        tc = 0
        tnc = 0
        
        for i in range(m):
            n, c = map(int, input().split())
            tnc += n * c
            tc += c
        
        r = tnc / (tc * 100)
        print("{:.4f}".format(r))
    except EOFError:
        break