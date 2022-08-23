(ns learn.functions.7kyu.mumbling
  (:require [clojure.string :as str]))

(defn- build-string [s idx]
  (str/capitalize (str/join "" (repeat (inc idx) (nth s idx)))))

(defn- accum-helper [s idx acc]
  (if (= (count s) idx)
    acc
    (accum-helper s (inc idx) (str acc (build-string s idx) (if (= (count s) (inc idx)) "" "-")))))

(defn accum [s]
  (accum-helper s 0 ""))

; third party solution

(defn accum2 [s]
  (->> s
       (map-indexed #(repeat (inc %1) %2))
       (map #(apply str %))
       (map str/capitalize)
       (str/join "-")))
