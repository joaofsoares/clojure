(ns learn.functions.7kyu.get-the-middle-character)

(defn get-middle [s]
  (if (even? (count s))
    (str (nth s (dec (/ (count s) 2))) (nth s (/ (count s) 2)))
    (str (nth (seq s) (/ (count s) 2)))))
