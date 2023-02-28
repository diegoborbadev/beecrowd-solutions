import Data.List (sort)
import GHC.Float (double2Int)

stirling :: Int -> Int
stirling n = floor (fromIntegral n * logBase 10 (fromIntegral n / exp 1) + logBase 10 (2 * pi * fromIntegral n) / 2.0) + 1

main :: IO ()
main = do
    n <- readLn :: IO Int

    let r = stirling n
    putStrLn $ show r