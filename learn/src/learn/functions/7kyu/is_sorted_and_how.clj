(ns learn.functions.7kyu.is-sorted-and-how)

(defn sorted-and-how?
  [sq]
  (let [nsq (distinct sq)]
    (cond
      (= sq (sort nsq)) "yes, ascending"
      (= sq (sort (comp - compare) nsq)) "yes, descending"
      :else "no")))
