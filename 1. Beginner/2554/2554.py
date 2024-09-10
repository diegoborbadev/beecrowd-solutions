while True:
    try:
        n, m = map(int, input().split())
        r = "Pizza antes de FdI"

        for i in range(m):
            a = input().split()
            b = ["1"]*n
            
            if (a[1:n+1] == b and r == "Pizza antes de FdI"):
                r = a[0]

        print(r)
    except EOFError:
        break