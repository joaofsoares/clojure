(ns learn.functions.7kyu.func-collections)

(defn head [xs]
  (first xs))

(defn last_ [xs]
  (last xs))

(defn init [xs]
  (into [] (butlast xs)))

(defn tail [xs]
  (into [] (rest xs)))
