import Text.Printf

main :: IO ()
main = do
    r <- readLn :: IO Double
    let v = (4 / 3.0) * 3.14159 * r * r * r
    printf "VOLUME = %.3f\n" v