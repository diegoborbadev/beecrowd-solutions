rafael = lambda x, y: (3 * x) ** 2 + y
beto = lambda x, y: 2 * (x ** 2) + (5 * y) ** 2
carlos = lambda x, y: -100 * x + y ** 3

while True:
    try:
        n = int(input())
        for i in range(n):
            x, y = map(int, input().split())
            
            r_rafael = rafael(x, y)
            r_beto = beto(x, y)
            r_carlos = carlos(x, y)
            if r_rafael > r_beto and r_rafael > r_carlos:
                print("Rafael ganhou")
            elif r_beto > r_rafael and r_beto > r_carlos:
                print("Beto ganhou")
            else:
                print("Carlos ganhou")
    except EOFError:
        break