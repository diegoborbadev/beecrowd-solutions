(let [input (read-line)
    [f1 f2] (map #(Double/parseDouble %) (clojure.string/split input #" "))]
  (let [ft (* 100 (- (* (+ 1 (/ f1 100)) (+ 1 (/ f2 100))) 1))]
    (println (format "%.6f" ft))))