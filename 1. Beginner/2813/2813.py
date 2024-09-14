hu = 0
hb = 0

wu = 0
wb = 0

n = int(input())
for i in range(n):
    sd, sn = input().split()
    if (sd == 'chuva'):
        if (hu < 1):
            hb += 1
        else:
            hu -= 1
        wu += 1
    if (sn == 'chuva'):
        if (wu < 1):
            wb += 1
        else:
            wu -= 1
        hu += 1

print(f"{hb} {wb}")