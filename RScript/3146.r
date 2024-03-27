input <- file('stdin', 'r')
x <- as.double(readLines(input, n=1))
write(paste(sprintf("%.2f", x * 6.28)), '')