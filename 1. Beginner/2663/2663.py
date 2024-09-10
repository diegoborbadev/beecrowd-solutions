def Itc(v, p, q, r):
    i, j, k = p, q, 0
    
    while i < q and j < r:
        if v[i] >= v[j]:
            w[k] = v[i]
            k += 1
            i += 1
        else:
            w[k] = v[j]
            k += 1
            j += 1
    
    while i < q:
        w[k] = v[i]
        k += 1
        i += 1
    
    while j < r:
        w[k] = v[j]
        k += 1
        j += 1
    
    for i in range(p, r):
        v[i] = w[i - p]

def Msrt(v, p, r):
    if p < r - 1:
        q = (p + r) // 2
        Msrt(v, p, q)
        Msrt(v, q, r)
        Itc(v, p, q, r)

w = [0] * 1002
vet = [0] * 1005

def verif(a, i, f):
    c = 0
    
    for j in range(i, f):
        if vet[j] == a:
            c += 1
    
    return c

m = int(input())
n = int(input())

for i in range(m):
    vet[i] = int(input())

Msrt(vet, 0, m)

print(verif(vet[n-1], n, m) + n)