while True:
    try:
        n = int(input())
       
        i = 1 
        r = 1
        while (i % n):
            i = ((i * 10) + 1) % n
            r+= 1
        
        print(r)

    except EOFError:
        break