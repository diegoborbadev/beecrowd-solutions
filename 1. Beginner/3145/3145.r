input <- file('stdin', 'r')
n <- as.double(readLines(input, n=1))
x <- as.double(readLines(input, n=1))
write(paste(sprintf("%.2f", x / (n + 2))), '')