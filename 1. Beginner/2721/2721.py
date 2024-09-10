r = ["Dasher", "Dancer", "Prancer", "Vixen",
     "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"]

soma = -1
for n in [int(x) for x in input().split()]:
    soma+= n

print(r[soma % 9])  