(ns learn.functions.4kyu.human-readable-duration-format
  (:require [clojure.string :as str]))

(defn- build-date
  [n s]
  (if (> n 1)
    (str n " " s "s")
    (str n " " s)))

(defn- get-time
  [secs res]
  (cond
    (= secs 0) res
    (>= secs 31536000) (let [n (quot secs 31536000)]
                         (get-time (- secs (* 31536000 n)) (cons (build-date n "year") res)))
    (>= secs 86400) (let [n (quot secs 86400)]
                      (get-time (- secs (* 86400 n)) (cons (build-date n "day") res)))
    (>= secs 3600) (let [n (quot secs 3600)]
                     (get-time (- secs (* 3600 n)) (cons (build-date n "hour") res)))
    (>= secs 60) (let [n (quot secs 60)]
                   (get-time (- secs (* 60 n)) (cons (build-date n "minute") res)))
    :else (get-time 0 (cons (build-date secs "second") res))))

(defn- format-result
  [res]
  (let [cnt (count res)]
    (cond
      (= cnt 1) (first res)
      (= cnt 2) (str/join " and " res)
      :else (let [init (take (dec cnt) res)
                  remaining (first (drop (dec cnt) res))]
              (str (str/join ", " init) " and " remaining)))))

(defn formatDuration [secs]
  (if (= secs 0)
    "now"
    (->> (get-time secs "")
         reverse
         format-result)))

(formatDuration 0)
(formatDuration 1)
(formatDuration 62)
(formatDuration 120)
(formatDuration 3600)
(formatDuration 3662)
