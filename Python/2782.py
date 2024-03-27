n = int(input())
l = [int(x) for x in input().split()]

r = 1
for x in range(2, n):
    if l[x] - l[x-1] != l[x-1] - l[x-2]:
        r += 1

print(r)