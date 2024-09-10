for i in range(int(input())):
    j = 0
    m = 0
    
    for i in range(3):
        x, d = map(int, input().split())
        j+= x*d
    
    for i in range(3):
        x, d = map(int, input().split())
        m+= x*d

    if j > m:
        print("JOAO")
    else:
        print("MARIA")