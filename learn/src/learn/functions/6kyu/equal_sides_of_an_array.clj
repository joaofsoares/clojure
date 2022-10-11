(ns learn.functions.6kyu.equal-sides-of-an-array)

(defn find-even-index [arr]
  (let [size (count arr)]
    (loop [idx 0
           result -1]
      (if (or (>= result 0) (= idx size))
        result
        (let [[left right] (split-at idx arr)]
          (if (= (reduce + left) (reduce + (rest right)))
            (recur (inc idx) idx)
            (recur (inc idx) result)))))))


(find-even-index [1,2,3,4,3,2,1])
(find-even-index [1,100,50,-51,1,1])
(find-even-index [1,2,3,4,5,6])
(find-even-index [0 0 0 0 0])
