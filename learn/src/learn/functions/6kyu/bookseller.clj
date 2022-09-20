(ns learn.functions.6kyu.bookseller
  (:require [clojure.string :as str]))

(defn- sum-group [g]
  (->> (map #(flatten (rest (str/split % #" "))) g)
       (flatten)
       (map #(Integer/parseInt %))
       (reduce +)))

(defn- calc-group [c g]
  (let [v (get g (.charAt c 0))]
    (if (nil? v)
      [(str c) 0]
      [(str c) (sum-group v)])))

(defn stock-list [list-of-books list-of-cat]
  (cond
    (empty? list-of-books) []
    (empty? list-of-cat) []
    :else (let [group (group-by #(first %) list-of-books)]
            (loop [cat list-of-cat
                   acc []]
              (if (nil? (first cat))
                acc
                (recur (rest cat) (conj acc (calc-group (first cat) group))))))))

(def ur ["BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"])
(def vr ["A" "B" "C" "D"])

(stock-list ur vr)