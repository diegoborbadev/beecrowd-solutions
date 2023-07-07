while True:
    try:
        H, Z, L = map(int, input().split())
        
        if (H > Z and H < L) or (H < Z and H > L):
            print("huguinho")
        elif (Z > H and Z < L) or (Z < H and Z > L):
            print("zezinho")
        else:
            print("luisinho")
    except EOFError:
        break