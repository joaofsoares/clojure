(ns learn.functions.7kyu.first-class-function)

(defn factory [x]
  (fn [xs] (map #(* % x) xs)))
