(ns learn.functions.6kyu.encrypt-this
  (:require [clojure.string :as str]))

(defn- encrypt
  [word]
  (cond
    (= (count word) 1) (int (first word))
    (= (count word) 2) (let [h (first word)
                             l (last word)]
                         (str (int h) l))
    :else (let [h (first word)
                s (second word)
                m (butlast (drop 2 word))
                l (last word)]
            (str (int h) l (apply str m) s))))

(defn- format-result
  [words]
  (if (= (count words) 1)
    (apply str words)
    (apply str (str/join " " words))))

(defn encrypt-this
  [txt]
  (->> (str/split txt #" ")
       (map encrypt)
       (format-result)))

(encrypt-this "Hello")
(encrypt-this "good")
(encrypt-this "hello world")

(encrypt-this "A wise old owl lived in an oak")
(encrypt-this "The more he saw the less he spoke")

