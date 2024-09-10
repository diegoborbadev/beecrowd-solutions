h1, m1, h2, m2 = map(int, input().split())

if h2 <= h1 and m2 <= m1:
    h2 += 24
elif m2 <= m1:
    m2 += 60
    h2 -= 1

t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60))
h = t // 3600
m = (t - (h * 3600)) // 60

print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (h, m))