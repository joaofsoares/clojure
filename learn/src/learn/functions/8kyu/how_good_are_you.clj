;; how good are you really

(ns learn.functions.8kyu.how-good-are-you)

(defn- find-scores-avg [scores]
  (/ (reduce + scores) (count scores)))

(defn better-than-average [class_points your_points]
  (> your_points (find-scores-avg class_points)))
