(defn parse-input [input]
    (map read-string (clojure.string/split input #" ")))

(let [[n x] (parse-input (read-line))]
    (println (format "%.2f" (/ (double x) (+ 2 n))))
)