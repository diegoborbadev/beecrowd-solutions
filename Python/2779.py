t = int(input())
l = []

for i in range(int(input())):
    n = int(input())
    if (not(n in l)):
        t-= 1
        l.append(n)

print(t)