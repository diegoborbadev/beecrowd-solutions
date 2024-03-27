x = input().split(" ")

a = int(x[0])
b = int(x[1])
if b < 0:
    t1 = (a//(b*-1))*-1
    t2 = a%(b*-1)
else:
    t1 = a//b
    t2 = a%b

print("{} {}".format(t1,t2))