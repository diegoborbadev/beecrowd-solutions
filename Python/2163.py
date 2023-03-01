l = input().split()
nl, nc = int(l[0]), int(l[1])

m = list() 

for i in range(nl):                               
    m.append( [int(col_i) for col_i in input().split()] )  

t = t2 = 0
f = False

for i in range(1, nl-1):
    if f:
        break

    for j in range(1, nc-1):
        if m[i][j] == 42:
            if m[i-1][j-1] == 7 and m[i-1][j] == 7 and m[i-1][j+1] == 7:
                if m[i][j-1] == 7 and m[i][j + 1] == 7:
                    if m[i+1][j-1] == 7 and m[i+1][j] == 7 and m[i+1][j+1] == 7:
                        t = i+1
                        t2 = j+1
                        f = True
                        break

print("{} {}".format(t, t2))