for i in range(int(input())):
    r = ""
    for a in input().split(' '):
        if a != '':
            r += a[0]
    
    print(r)