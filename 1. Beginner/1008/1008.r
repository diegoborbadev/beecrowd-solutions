input <- file('stdin', 'r')

n <- as.integer(readLines(input, n=1))
m <- as.integer(readLines(input, n=1))
s <- as.double(readLines(input, n=1))

cat(sprintf("NUMBER = %d\nSALARY = U$ %.2f\n", n, m * s))