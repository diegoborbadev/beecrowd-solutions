a = int(input())
b = int(input())
c = int(input())

print(f"A = {a:d}, B = {b:d}, C = {c:d}")
print(f"A = {a:10d}, B = {b:10d}, C = {c:10d}")
print(f"A = {str(a).zfill(10):s}, B = {str(b).zfill(10):s}, C = {str(c).zfill(10):s}")
print(f"A = {a:<10d}, B = {b:<10d}, C = {c:<10d}")