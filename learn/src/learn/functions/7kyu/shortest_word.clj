(ns learn.functions.7kyu.shortest-word
  (:require [clojure.string :as str]))

(defn find-shortest-word [word]
  (->> (str/split word #" ")
       (map count)
       (apply min)))

(find-shortest-word "bitcoin take over the world maybe who knows perhaps")
