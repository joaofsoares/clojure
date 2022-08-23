(ns learn.functions.8kyu.square-sum)

(defn square-sum [lst]
  (reduce + (map #(* % %) lst)))
