try:
    while True:
        n, m = map(int, input().split())
        print(n ^ m)
except EOFError:
    pass