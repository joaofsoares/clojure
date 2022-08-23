(ns learn.functions.7kyu.rotate-to-max
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [clojure.core :refer :all]))

(defn- rotate-left [xs]
  (str (subs xs 1) (get xs 0)))

(defn- get-values [xs cnt acc]
  (cond
    (= (count xs) cnt) acc
    (= cnt 0) (get-values (rotate-left xs) (inc cnt) (conj acc xs))
    :else (get-values (str (subs xs 0 cnt) (rotate-left (subs xs cnt))) (inc cnt) (conj acc xs))))

(defn max-rot [n]
  (->> (get-values (str n) 0 (empty []))
       (map parse-long)
       (reduce max)))

(max-rot 56789)
(max-rot 38458215)
(max-rot 195881031)
(max-rot 896219342)
(max-rot 69418307)
