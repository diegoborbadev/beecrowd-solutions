using Printf

n = parse(Int, readline())
m = parse(Int, readline())
s = parse(Float64, readline()) 

println("NUMBER = $n")
@printf("SALARY = U\$ %.2f\n", m * s)
