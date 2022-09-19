(ns learn.functions.6kyu.mexican-wave
  (:require [clojure.string :as str]))

(defn replace-at [s idx replacement]
  (str (subs s 0 idx) replacement (subs s (inc idx))))

(defn upper-letter [s c idx]
  (replace-at s idx (str/upper-case c)))

(defn wave [s]
  (let [size (count s)]
    (loop [idx 0
           acc []]
      (cond
        (= idx size) acc
        (= (nth s idx) \space) (recur (inc idx) acc)
        :else (recur (inc idx) (conj acc (upper-letter s (nth s idx) idx)))))))

(wave "hello")