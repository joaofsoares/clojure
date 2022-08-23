(ns learn.functions.7kyu.sum-of-numbers)

(defn get-sum2 [a b]
  (cond
    (= a b) a
    (> b a) (reduce + (range a (inc b)))
    :else (reduce + (range b (inc a)))))

