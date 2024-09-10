import Text.Printf

main :: IO ()
main = do
    x <- readLn :: IO Float
    putStrLn $ printf "%.2f" (x * 6.28)