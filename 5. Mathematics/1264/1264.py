while True:
    try:
        a = input()
        v = {}
        m = 0
        f = 0
        c = 0
        x = 0
        for i in range(48, 58):
            v[chr(i)] = x
            x += 1
        for i in range(65, 91):
            v[chr(i)] = x
            x += 1
        for i in range(97, 123):
            v[chr(i)] = x
            x += 1

        if a[0] == '-':
            a = a[1:]

        for ch in a:
            c = v[ch]
            f += c
            if c > m:
                m = c

        if f < 3:
            print("2")
        else:
            while m < 62:
                if f % m == 0:
                    print(m + 1)
                    break
                m += 1
            if m == 62:
                print("such number is impossible!")
    except EOFError:
        break