c = int(input())
l = int(input())

grid = [list(input()) for _ in range(l)]

i, j = 0, 0
current_direction = '!'
found = False

directions = {
    '>': (0, 1),
    '<': (0, -1),
    '^': (-1, 0),
    'v': (1, 0)
}

while not found:
    cell = grid[i][j]

    if cell == '.':
        grid[i][j] = current_direction
    elif cell == '*':
        found = True
        break
    elif cell == '!':
        break
    elif cell in directions:
        di, dj = directions[cell]
        if 0 <= i + di < l and 0 <= j + dj < c:
            current_direction = cell
            grid[i][j] = '!'
            i += di
            j += dj
        else:
            break

print(grid[i][j])