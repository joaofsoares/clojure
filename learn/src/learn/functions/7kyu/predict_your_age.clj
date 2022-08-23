(ns learn.functions.7kyu.predict-your-age)

(defn predict-age [& ages]
  (->> (map #(* % %) ages)
       (reduce +)
       (Math/sqrt)
       (#(/ % 2))
       (#(int (Math/floor %)))))
