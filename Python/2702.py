al = [int(x) for x in input().split()]
dl = [int(x) for x in input().split()]

r = 0
for i in range(3):
    aux = dl[i] - al[i]
    if aux > 0: r+= aux

print(r)