(ns learn.functions.7kyu.jaden-casing-strings
  (:require [clojure.string :as str]))

(defn jaden-case [s]
  (->> (str/split s #" ")
       (map str/capitalize)
       (str/join " ")))
