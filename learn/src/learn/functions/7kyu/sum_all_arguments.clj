(ns learn.functions.7kyu.sum-all-arguments)

(defn sum
  "Finds the sum of all of its arguments"
  [& args]
  (reduce + args))