(ns learn.functions.7kyu.strong-number)

(defn- factorial [num]
  (if (zero? num)
    1
    (* num (factorial (dec num)))))

(defn- my-parse-long [s]
  (Long/valueOf s))

(defn- get-result [orig n]
  (if (= orig n)
    "STRONG!!!!"
    "Not Strong !!"))

(defn- convert [n]
  (->> (str n)
       (seq)
       (map str)
       (map my-parse-long)))

(defn strong [n]
  (->> (convert n)
       (map factorial)
       (reduce +)
       (get-result n)))

(strong 1)
(strong 2)
(strong 145)
(strong 7)
