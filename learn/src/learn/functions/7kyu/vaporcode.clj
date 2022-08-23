(ns learn.functions.7kyu.vaporcode
  (:require [clojure.string :as str]))

(defn vaporcode [s]
  (->> (str/replace s " " "")
       (seq)
       (map str/upper-case)
       (str/join "  ")))
