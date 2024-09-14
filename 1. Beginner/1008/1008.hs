import Text.Printf

main :: IO ()
main = do
    n <- readLn :: IO Int
    m <- readLn :: IO Double
    s <- readLn :: IO Double
    let r = m * s
    printf "NUMBER = %d\nSALARY = U$ %.2f\n" n r