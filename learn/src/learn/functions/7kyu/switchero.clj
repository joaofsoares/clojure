(ns learn.functions.7kyu.switchero)

(defn- switch [c]
  (cond
    (= \a c) \b
    (= \b c) \a
    :else c))

(defn switchero [xs]
  (->> (seq xs)
       (map switch)
       (apply str)))

(switchero "abc")
(switchero "aaabcccbaaa")
