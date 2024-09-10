def fat(n):
    fat = 1
    i = 2
    while i <= n:
        fat = fat*i
        i = i + 1

    return fat

while True:
    n = input()

    if n == "0":
        break

    r = 0
    for i in range(len(n)):
        r+= int(n[i]) * fat(len(n)-i)

    print(r)