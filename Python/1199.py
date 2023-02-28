while True:
    n = input()
    
    if n == '-1':
        break
    
    if n.isdigit():
        n = hex(int(n))
        n = n[:2] + n[2:].upper()
        print(n)
    
    else:
        print(int(n, 16))