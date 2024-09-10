import struct

a, b, c, d= input().split(" ", maxsplit = 3)
a = int(a)
b = struct.unpack('f', struct.pack('f', float(b)))[0]

print(f"{a:d}{b:f}{c}{d}")
print(f"{a:d}\t{b:f}\t{c}\t{d}")
print(f"{a:10d}{b:10f}{c:>10}{d:>10}")