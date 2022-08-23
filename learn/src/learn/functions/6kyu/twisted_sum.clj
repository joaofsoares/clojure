(ns learn.functions.6kyu.twisted-sum)

(defn- split-number [n]
  (if (= (count (str n)) 1)
    n
    (reduce + (map #(Character/digit % 10) (seq (str n))))))

(defn compute-sum [n]
  (->> (range 1 (inc n))
       (map split-number)
       (reduce +)))

(compute-sum 1)
(compute-sum 2)
(compute-sum 3)
(compute-sum 4)
(compute-sum 10)
(compute-sum 100)
