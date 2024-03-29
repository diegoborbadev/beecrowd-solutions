import Text.Printf

main :: IO ()
main = do
    a <- readLn :: IO Double
    b <- readLn :: IO Double
    c <- readLn :: IO Double
    let r = (a * 2 + b * 3 + c * 5) / 10
    printf "MEDIA = %.1f\n" r