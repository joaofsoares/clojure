;; Factorial

(ns learn.functions.8kyu.factorial)

(defn factorial [num]
  (if (zero? num)
    1
    (* num (factorial (dec num)))))
