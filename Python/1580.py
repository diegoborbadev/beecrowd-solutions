from math import factorial

M = 10**9 + 7

while True:
    try:
        inpt = input()
        freq = [0] * 26
        
        for c in inpt:
            freq[ord(c) - ord('A')] += 1
        
        r = factorial(len(inpt))
        for i in freq:
            r = (r * pow(factorial(i), M-2, M)) % M
        
        print(r)
    except EOFError:
        break