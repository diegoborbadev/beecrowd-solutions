count = 0
for x in enumerate(iter(int, 1)):
    count += 1
    
    n = int(input())
    if n == 0:
        break

    expr = input().strip()

    if n == 1:
        print(f"Teste {count}\n{expr}\n")
        continue
    
    result = 0
    current_number = ""
    sign = 1

    for char in expr:
        if char.isdigit():
            current_number += char
        else:
            result += sign * int(current_number)
            current_number = ""
            sign = 1 if char == '+' else -1
    result += sign * int(current_number)

    print(f"Teste {count}\n{result}\n")