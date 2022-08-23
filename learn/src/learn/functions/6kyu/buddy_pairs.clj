(ns learn.functions.6kyu.buddy-pairs)

(defn divisors [n]
  (for [i (range 2 (int (Math/floor (+ 1 (Math/sqrt n)))))
        :when (= (rem n i) 0)]
    (if (= (/ n i) i)
      i
      (+ i (/ n i)))))

(defn divisors-sum [n]
  (reduce + (divisors n)))

(defn get-values [start end]
  (for [n (range start end)
        :let [m (divisors-sum n)]
        :when (and (> m n) (= (divisors-sum m) n))]
    [n m]))

(defn buddy [start end]
  (let [result (first (get-values start end))]
    (if (empty? result)
      "Nothing"
      (str (sort (into () (flatten result)))))))

(buddy 10 50)
(buddy 48 50)
(buddy 2382, 3679)
(buddy 8983, 13355)
(buddy 1071625, 1103735)
(buddy 57345, 90061)
