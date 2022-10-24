(ns learn.functions.5kyu.greed-is-good)

(def rolls {[1 1] 100
            [1 2] 200
            [1 3] 1000
            [1 4] 1100
            [1 5] 1200
            [5 1] 50
            [5 2] 100
            [5 3] 500
            [5 4] 550
            [5 5] 600
            [6 3] 600
            [6 4] 600
            [6 5] 600
            [4 3] 400
            [4 4] 400
            [4 5] 400
            [3 3] 300
            [3 4] 300
            [3 5] 300
            [2 3] 200
            [2 4] 200
            [2 5] 200})

(defn score
  [dice]
  (->> (frequencies dice)
       (map #(get rolls % 0))
       (reduce +)))
