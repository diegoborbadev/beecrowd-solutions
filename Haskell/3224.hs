main :: IO ()
main = do
    jon <- getLine
    doc <- getLine
    if length jon >= length doc
        then putStrLn "go"
        else putStrLn "no"