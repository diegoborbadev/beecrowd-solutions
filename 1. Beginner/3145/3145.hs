import Text.Printf

main :: IO ()
main = do
    input <- getLine
    let [n, x] = map read (words input) :: [Double]
    let r = x / (n + 2)
    printf "%.2f\n" r