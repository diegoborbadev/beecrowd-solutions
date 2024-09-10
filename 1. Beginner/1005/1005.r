input <- file('stdin', 'r')
a <- as.double(readLines(input, n=1))
b <- as.double(readLines(input, n=1))
write(paste(sprintf("MEDIA = %.5f", (a * 3.5 + b * 7.5) / 11)), '')