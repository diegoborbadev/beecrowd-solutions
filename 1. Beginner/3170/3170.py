import math

n = int(input())
m = int(input())
r = math.floor(m/2 - n)

if (r > 0):
    print("Faltam {} bolinha(s)".format(r))
    
else:
    print("Amelia tem todas bolinhas!")