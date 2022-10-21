(ns learn.functions.5kyu.gap-in-primes)

(def primes
  (cons 1 (lazy-seq
           (filter (fn [i]
                     (not-any? (fn [p] (zero? (rem i p)))
                               (take-while #(<= % (Math/sqrt i))
                                           (rest primes))))
                   (drop 2 (range))))))

(defn- create-primes
  [x y]
  (filter #(> % x) (take-while #(< % y) primes)))

(defn- find-gap
  [primes value]
  (if (<= (count primes) 1)
    nil
    (let [fst (first primes)
          snd (second primes)]
      (cond
        (empty? primes) nil
        (or (nil? first) (nil? second)) nil
        (= (- snd fst) value) [fst snd]
        :else (recur (rest primes) value)))))

(defn gap
  [g m n]
  (find-gap (create-primes m n) g))

