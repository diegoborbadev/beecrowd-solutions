import math

g = 9.80665
pi = 3.14159

while True:
    try:
        h0 = float(input())
        p1, p2 = map(int, input().split())
        n = int(input())
        
        for i in range(n):
            ang, v = map(float, input().split())

            sin =  math.sin((ang * pi) / 180.0)
            cos = math.cos((ang * pi) / 180.0)

            a = ((v * sin) ** 2) / (2 * g)
            h = h0 + a
            
            voy = v * sin
            vox = v * cos
            
            r = ((vox * voy) / g) + (vox * (math.sqrt((2 * h) / g)))
            
            if not (p1 <= r <= p2):
                print(f"{r:.5f} -> NUCK")
            
            else:
                print(f"{r:.5f} -> DUCK")
    except EOFError:
        break