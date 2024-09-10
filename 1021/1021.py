n = float(input())

print('NOTAS:')
print('{} nota(s) de R$ 100.00'.format(int(n // 100)))
n = n%100

print('{} nota(s) de R$ 50.00'.format(int(n // 50)))
n = n%50

print('{} nota(s) de R$ 20.00'.format(int(n // 20)))
n = n%20

print('{} nota(s) de R$ 10.00'.format(int(n // 10)))
n = n%10

print('{} nota(s) de R$ 5.00'.format(int(n // 5)))
n = n%5

print('{} nota(s) de R$ 2.00'.format(int(n // 2)))
n = n%2

print('MOEDAS:')
print('{} moeda(s) de R$ 1.00'.format(int(n // 1)))
n = n%1

print('{} moeda(s) de R$ 0.50'.format(int(float('%.2f'% (n // 0.5)))))
n = n%0.5

print('{} moeda(s) de R$ 0.25'.format(int(float('%.2f'% (n // 0.25)))))
n = n%0.25

print('{} moeda(s) de R$ 0.10'.format(int(float('%.2f'% (n // 0.10)))))
n = n%0.10

print('{} moeda(s) de R$ 0.05'.format(int(float('%.2f'% (n // 0.05)))))
n = n%0.05

print('{} moeda(s) de R$ 0.01'.format(int(float('%.2f'% (n * 100)))))