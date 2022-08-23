(ns learn.functions.7kyu.two-to-one)

(defn longest [s1 s2]
  (->> (str s1 s2)
       (sort)
       (distinct)
       (apply str)))


(longest "aretheyhere" "yestheyarehere")
(longest "loopingisfunbutdangerous" "lessdangerousthancoding")
(longest "inmanylanguages", "theresapairoffunctions")
