using Printf

a = parse(Float64, readline())
b = parse(Float64, readline())
@printf("MEDIA = %.5f\n", (a * 3.5 + b * 7.5) / 11)