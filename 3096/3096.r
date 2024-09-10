input <- file('stdin', 'r')

n <- as.integer(readLines(input, n=1))
r <- floor(n*log10(n/exp(1)) + log10(2*pi*n)/2 + 1)
write(paste(r), '')