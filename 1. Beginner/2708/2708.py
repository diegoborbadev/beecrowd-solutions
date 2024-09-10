t = 0
j = 0

while True:
    inp = input()

    if inp == "ABEND":
        break

    mov, qnt = inp.split()
    qnt = int(qnt)

    if mov == "SALIDA":
        t += qnt
        j += 1
    elif mov == "VUELTA":
        t -= qnt
        j -= 1

print(t)
print(j)