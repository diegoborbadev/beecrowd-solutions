n = tonumber(io.read())
r = math.floor(n * math.log10(n/math.exp(1)) + math.log10(2*math.pi*n)/2.0) + 1
print(r)