g = 0
e = 0

l = input().split()
for i in range(len(l)):
    if 2 < i < 5:
        e += int(l[i])
    else:
        g += int(l[i])

print("Middle-earth is safe." if g > e else "Sauron has returned.")