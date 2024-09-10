N, C, M = map(int, input().split())
car = list(map(int, input().split()))
com = list(map(int, input().split()))
print(len(set(car) - set(com)))