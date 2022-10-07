(ns learn.functions.6kyu.pyramid-array)

(defn pyramid [n]
  (map #(repeat % 1) (range 1 (inc n))))

(pyramid 0)
(pyramid 1)
(pyramid 2)
(pyramid 3)
