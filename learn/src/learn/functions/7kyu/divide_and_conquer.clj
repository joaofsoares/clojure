(ns learn.functions.7kyu.divide-and-conquer)

(defn- parse-int [s]
  (Integer/parseInt (re-find #"\A-?\d+" s)))

(defn div-con [x]
  (- (reduce + (filter integer? x)) (reduce + (map parse-int (filter string? x)))))
