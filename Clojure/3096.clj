(let [n (Integer/parseInt (read-line))
    result (-> (+ (* n (Math/log10 (/ n Math/E)))
                    (/ (Math/log10 (* 2 Math/PI n)) 2.0))
                Math/floor
                (+ 1)
                int)]
(println result))