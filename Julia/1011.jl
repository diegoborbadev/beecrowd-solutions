using Printf

r = parse(Float64, readline())
@printf("VOLUME = %.3f\n", (4 / 3.0) * 3.14159 * r * r * r)