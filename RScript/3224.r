input <- file('stdin', 'r')

jon <- readLines(input, n=1)
doc <- readLines(input, n=1)

if (nchar(jon) >= nchar(doc)) {
    write("go", '')
} else {
    write("no", '')
}