def isFibonacci(n):
    a, b = 1, 1
    while a <= n:
        if a == n:
            return True
        a, b = b, a + b
    return False

k = int(input())
count = 0
num = 1
while count < k:
    num += 1
    if not isFibonacci(num):
        count += 1

print(num)