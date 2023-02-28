while True:
    try:
        n = int(input())

        m, l = map(int, input().split())
        
        mc = [list(map(int, input().split())) for _ in range(m)]
        lc = [list(map(int, input().split())) for _ in range(l)]
        
        cm, cl = map(int, input().split())
        
        a = int(input())

        if mc[cm-1][a-1] > lc[cl-1][a-1]:
            print("Marcos")
        
        elif lc[cl-1][a-1] > mc[cm-1][a-1]:
            print("Leonardo")
        
        else:
            print("Empate")
    except EOFError:
        break