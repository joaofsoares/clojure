(ns learn.functions.8kyu.positive-sum)

(defn positive-sum [xs]
  (reduce + (filter #(> % 0) xs)))
