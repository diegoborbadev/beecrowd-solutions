while True:
    try:
        s = input()
        r = 0
        for i, char in enumerate(reversed(s)):
            r += (ord(char) - ord('A') + 1) * (26 ** i)
        if r <= 16384:
            print(r)
        else:
            print("Essa coluna nao existe Tobias!")
    except EOFError:
        break