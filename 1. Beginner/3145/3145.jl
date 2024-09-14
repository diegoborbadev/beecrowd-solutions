using Printf

n, x = parse.(Float64, split(readline()))

r = x / (n + 2)
@printf("%.2f\n", r)