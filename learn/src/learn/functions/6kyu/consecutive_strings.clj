(ns learn.functions.6kyu.consecutive-strings)

(defn- create-cons
  [arr n res]
  (if (empty? arr)
    (reverse res)
    (recur (rest arr) n (cons (apply str (take n arr)) res))))

(defn- find-longest
  [arr]
  (->> (map count arr)
       (reduce max)))

(defn longest-cons
  [strarr k]
  (let [cnt (count strarr)]
    (if (or (> k cnt) (or (<= k 0) (= cnt 0)))
      ""
      (let [str-cons (create-cons strarr k [])
            cnt (find-longest str-cons)
            f-cnt (filter #(= cnt (count %)) str-cons)]
        (first f-cnt)))))

(def x ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"])
(longest-cons x 2)

(def y ["ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"])
(longest-cons y 1)

(longest-cons [] 3)
