(ns learn.functions.6kyu.sort-odd)

(defn- sort-helper [xs odds res]
  (cond
    (empty? xs) (reverse res)
    (odd? (first xs)) (recur (rest xs) (rest odds) (cons (first odds) res))
    :else (recur (rest xs) odds (cons (first xs) res))))

(defn sort-array [xs]
  (let [odds (sort (filter odd? xs))]
    (println "odds: " odds)
    (sort-helper xs odds [])))

(sort-array [7 1])
(sort-array [5, 8, 6, 3, 4])
(sort-array [9, 8, 7, 6, 5, 4, 3, 2, 1, 0])
