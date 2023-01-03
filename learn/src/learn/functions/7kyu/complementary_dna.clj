(ns learn.functions.7kyu.complementary-dna
  (:require [clojure.string :as str]))

(defn get-dna-pair
  [elem]
  (cond
    (= elem \A) \T
    (= elem \T) \A
    (= elem \C) \G
    (= elem \G) \C
    :else ""))

(defn dna-strand
  [dna]
  (->> (map get-dna-pair dna)
       (str/join "")))
¡¡