(def a (read-string (read-line)))
(def b (read-string (read-line)))
(def c (read-string (read-line)))

(def r (/ (+ (* a 2.0) (* b 3.0) (* c 5.0)) 10))

(println (format "MEDIA = %.1f" r))