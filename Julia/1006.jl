using Printf

a = parse(Float64, readline())
b = parse(Float64, readline())
c = parse(Float64, readline())
@printf("MEDIA = %.1f\n", (a * 2 + b * 3 + c * 5) / 10)