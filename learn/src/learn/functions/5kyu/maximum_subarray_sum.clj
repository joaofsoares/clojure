(ns learn.functions.5kyu.maximum-subarray-sum)

(defn- get-max
  [xs current-sum max-sum]
  (if (empty? xs)
    max-sum
    (let [fst (first xs)
          cs (+ current-sum fst)]
      (recur (rest xs) (max fst cs) (max max-sum cs)))))

(defn max-sequence
  [xs]
  (get-max xs 0 0))
