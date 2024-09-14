input <- file('stdin', 'r')
r <- as.double(readLines(input, n=1))
write(paste(sprintf("A=%.4f", 3.14159 * r * r)), '')