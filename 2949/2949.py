a = 0
e = 0
h = 0
m = 0
x = 0

for i in range(int(input())):
    b = input().split()[1]

    if (b == "A"):
        a += 1
    elif (b == "E"):
        e += 1
    elif (b == "H"):
        h += 1
    elif (b == "M"):
        m+=1
    elif (b == "X"):
        x+=1

print(f'{x} Hobbit(s)')
print(f'{h} Humano(s)')
print(f'{e} Elfo(s)')
print(f'{a} Anao(oes)')
print(f'{m} Mago(s)')