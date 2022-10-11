(ns learn.functions.5kyu.scramblies)

(defn scramble [s1 s2]
  (let [freq-s1 (frequencies s1)
        freq-s2 (frequencies s2)
        result (map #(>= (get freq-s1 % 0) (get freq-s2 % 0)) (seq s2))]
    (every? true? result)))

(scramble "rkqodlw" "world")
(scramble "cedewaraaossoqqyt" "codewars")
(scramble "katas" "steak")
