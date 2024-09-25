n = int(input())
e = list(map(int, input().split()))

e.sort()

nxt = e[-1] + 1

while True:
    for elf in e:
        if nxt % elf == 0 and elf != 1:
            nxt += 1
            break
    else:
        break

print(nxt)