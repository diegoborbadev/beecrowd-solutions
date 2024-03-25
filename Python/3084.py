while True:
    try:
        inpt = input().split()
        hours = int(inpt[0])
        minutes = int(inpt[1])
        print(f"{hours//30:02d}:{minutes//6:02d}")
    except EOFError:
        break