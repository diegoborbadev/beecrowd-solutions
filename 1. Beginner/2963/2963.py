aux = 0
r = "S"
for i in range(int(input())):
    n = int(input())
    
    if(n > aux):
        if(i>0):
            r = "N"
        else:
            aux = n

print(r)