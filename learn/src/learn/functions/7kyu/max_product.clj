(ns learn.functions.7kyu.max-product)

(defn max-product [arr size]
  (->> (sort > arr)
       (take size)
       (reduce *)))


(max-product [4 3 5] 2)
(max-product [10 8 7 9] 3)
