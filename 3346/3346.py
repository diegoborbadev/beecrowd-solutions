f1, f2 = [float(x) for x in input().split()]

ft = ((1 + f1 / 100) * (1 + f2 / 100) - 1) * 100

print(f'{ft:.6f}')