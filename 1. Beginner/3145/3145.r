input <- file('stdin', 'r')
values <- strsplit(readLines(input, n=1), " ")[[1]]
n <- as.double(values[1])
x <- as.double(values[2])
write(paste(sprintf("%.2f", x / (n + 2))), '')