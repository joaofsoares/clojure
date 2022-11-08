(ns learn.functions.6kyu.which-are-in
  (:require [clojure.string :as str]))

(defn- str-includes?
  [strs subs]
  (let [f (filter #(str/includes? % subs) strs)]
    (> (count f) 0)))

(defn in-array [array1 array2]
  (sort (distinct (filter #(str-includes? array2 %) array1))))

(def ur ["olp" "love" "string"])
(def vr ["ulove" "alove" "holp" "sholp","vfmstring"])
(def rr ["love" "olp" "string"])

(= (in-array ur vr) rr)
(in-array ur vr)
(sort (in-array ur vr))
