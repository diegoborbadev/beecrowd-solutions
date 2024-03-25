def verify(r, x, y):
    if r == x:
        return y
    elif r == y:
        return x
    return r

n = int(input())
r = input()[0]

for _ in range(n):
    choice = int(input())
    if choice == 1:
        r = verify(r, 'A', 'B')
    elif choice == 2:
        r = verify(r, 'B', 'C')
    elif choice == 3:
        r = verify(r, 'A', 'C')

print(r)