(ns learn.functions.6kyu.stop-spinning-my-words
  (:require [clojure.string :as str]))

(defn- reverse-word [s]
  (cond
    (>= (count s) 5) (apply str (reverse s))
    :else s))

(defn spin-words [s]
  (->> (str/split s #" ")
       (map reverse-word)
       (str/join " ")))

(spin-words "Welcome")
(spin-words "Hey fellow warriors")
