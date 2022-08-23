(ns learn.functions.8kyu.is-divisible)

(defn is-divisible [n x y]
  (= (mod n x) (mod n y) 0))
