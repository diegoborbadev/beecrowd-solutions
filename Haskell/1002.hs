import Text.Printf

main :: IO ()
main = do
    r <- readLn :: IO Double
    let a = 3.14159 * r * r
    printf "A=%.4f\n" a