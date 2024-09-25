n = int(input())
elfs = list(map(int, input().split()))

elfs.sort()

nxt = elfs[-1] + 1

while True:
    for elf in elfs:
        if nxt % elf == 0 and elf != 1:
            nxt += 1
            break
    else:
        break

print(nxt)