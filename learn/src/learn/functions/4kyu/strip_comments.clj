(ns learn.functions.4kyu.strip-comments
  (:require [clojure.string :as str]))

(defn- in?
  [coll elm]
  (not (> (count (filter #(= (str elm) (str %)) coll)) 0)))

(defn- get-string
  [s symbs]
  (take-while #(in? symbs %) s))

(defn- get-lines
  [ss]
  (if (> (count ss) 1)
    (str/replace (str/join #"\n" (map #(str/trimr (apply str %)) ss)) "\\n" "\n")
    (str/trimr (apply str (flatten ss)))))

(defn- get-formatted-lines
  [txt symbs]
  (->> (str/split-lines txt)
       (map #(get-string % symbs))
       (get-lines)))

(defn strip-comments
  [txt symbs]
  (get-formatted-lines txt symbs))


(strip-comments "apple ! banana" '("#" "!"))
(strip-comments "apples, pears # and bananas\ngrapes\nbananas !apples" '("#" "!"))
(strip-comments "a #b\nc\nd $e f g" '("#" "$"))
(strip-comments "a \n b \nc " (quote ("#" "$")))
