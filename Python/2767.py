while True:
    try:
        n, m, k = map(int, input().split())

        p = [0] * 100000

        for h in map(int, input().split()):
            p[h % k] += 1

        r = 0
        for m in map(int, input().split()):
            r += p[(k - (m % k)) % k]

        print(r)

    except EOFError:
        break