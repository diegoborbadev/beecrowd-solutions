(def a (read-string (read-line)))
(def b (read-string (read-line)))

(def r (/ (+ (* a 3.5) (* b 7.5)) 11))
(println (format "MEDIA = %.5f" r))