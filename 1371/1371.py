while True:
    a = int(input())
    if a == 0:
        break
    b = 0
    for i in range(1, a+1, 2):
        b += i
        if b > a:
            break
        if i > 1:
            print(" ", end="")
        print(b, end="")
    print()