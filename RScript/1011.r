input <- file('stdin', 'r')
r <- as.double(readLines(input, n=1))
write(paste(sprintf("VOLUME = %.3f", (4 / 3.0) * 3.14159 * r * r * r)), '')