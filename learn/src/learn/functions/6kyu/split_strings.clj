(ns learn.functions.6kyu.split-strings)

(defn solution [s]
  (->> (partition 2 2 "_" s)
       (map #(apply str %))))


(solution "cdabefg")
(solution "cdabefgh")
