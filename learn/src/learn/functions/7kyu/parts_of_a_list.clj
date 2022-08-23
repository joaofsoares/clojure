(ns learn.functions.7kyu.parts-of-a-list
  (:require [clojure.string :as str]))

(defn- part-list-helper [arr cnt acc]
  (cond
    (= (count arr) cnt) acc
    :else (recur arr (inc cnt) (conj acc (list (str/join " " (take cnt arr)) (str/join " " (drop cnt arr)))))))

(defn part-list [arr]
  (part-list-helper arr 1 []))

(part-list ["I", "wish", "I", "hadn't", "come"])
