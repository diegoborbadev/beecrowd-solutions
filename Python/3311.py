n = int(input())
names_list = [[] for _ in range(26)]

for _ in range(n):
    name = input()
    index = ord(name[0].lower()) - ord('a')
    names_list[index].append(name)

for names in names_list:
    for name in names:
        if name:
            print(name)