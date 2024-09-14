n, x = io.read():match("(%d+) (%d+)")
n = tonumber(n)
x = tonumber(x)
print(string.format("%.2f", x / (n + 2)))