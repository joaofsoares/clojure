(ns learn.functions.6kyu.reach-me-and-sum-my-digits)

(defn- get-terms [val pattern]
  (if (empty? pattern)
    val
    (recur (+ val (first pattern)) (rest pattern))))


(defn- sum-digits [num]
  (->> (str num)
       seq
       (map #(Character/digit % 10))
       (reduce +)))

(defn sum-dig-nth-term [initval patternl nthterm]
  (->> (take (- nthterm 1) (cycle patternl))
       (get-terms initval)
       sum-digits))

(sum-dig-nth-term 10, [2, 1, 3], 6)
(sum-dig-nth-term 10, [2, 1, 3], 15)
(sum-dig-nth-term 10, [2, 1, 3], 50)
(sum-dig-nth-term 10, [2, 1, 3], 78)
(sum-dig-nth-term 10, [2, 1, 3], 157)
