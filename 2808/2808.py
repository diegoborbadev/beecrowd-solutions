x, y = input().split()

col_x, line_x = x
col_y, line_y = y

col_diff = abs(ord(col_x) - ord(col_y))
line_diff = abs(int(line_x) - int(line_y))

if (col_diff == 1 and line_diff == 2) or (col_diff == 2 and line_diff == 1):
    print('VALIDO')
else:
    print('INVALIDO')