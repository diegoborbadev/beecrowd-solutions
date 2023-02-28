n = int(input())

for i in range(n):
    x, y = input().split(' ')
    
    if len(y) > len(x):
        print('nao encaixa')
    
    else:
        if x[len(x) - len(y): len(x)] == y:
            print('encaixa')
       
        else:
            print('nao encaixa')