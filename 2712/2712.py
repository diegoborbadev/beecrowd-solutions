def ver(p):
    if len(p) != 8:
        return False

    if p[3] != '-':
        return False

    contador = sum(1 for c in p[:3] if c.isalpha() and c.isupper())
    if contador != 3:
        return False

    for c in p[4:]:
        if not c.isdigit():
            return False

    return True


days = ["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"]
for _ in range(int(input())):
    p = input().strip()

    if ver(p):
        l = p[-1]
        if l in ['1', '2']:
            d = 0
        elif l in ['3', '4']:
            d = 1
        elif l in ['5', '6']:
            d = 2
        elif l in ['7', '8']:
            d = 3
        elif l in ['9', '0']:
            d = 4
        print(days[d])
    else:
        print("FAILURE")