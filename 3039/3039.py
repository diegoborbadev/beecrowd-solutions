n = int(input())

f = 0
m = 0
for i in range(n):
    a, b = input().split()
    
    if(b == "F"):
        f+=1
    elif (b == "M"):
        m+=1

print(f'{m} carrinhos')
print(f'{f} bonecas')