(ns learn.functions.6kyu.count-smiley-faces)

(defn count-smileys [arr]
  (->> (filter #(re-matches #"[:;][-~]?[D)]" %) arr)
       count))

(count-smileys [":)" ";(" ";}" ":-D"])
