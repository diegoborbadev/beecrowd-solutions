for i in range(int(input())):
    n1, m1 = map(int, input().split(" x "))
    m2, n2 = map(int, input().split(" x "))

    nt = n1 + n2
    mt = m1 + m2

    if (nt > mt):
        print("Time 1")

    elif (nt < mt):
        print("Time 2")

    else:
        if(m1 < n2):
            print("Time 1")

        elif(m1 > n2):
            print("Time 2")

        else:
            print("Penaltis")