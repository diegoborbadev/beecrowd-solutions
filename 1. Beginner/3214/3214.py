e, f, c = map(int, input().split())

empt = e + f
t = 0

while empt >= c:
    new = empt // c 
    t += new 
    empt = new + (empt % c)

print(t)