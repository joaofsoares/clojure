(ns learn.functions.create-list-primes)

(defn create-primes [n]
  (reduce (fn [primes number] (if (nil? (some (partial = 0) (map (partial mod number) primes))) (conj primes number) primes)) [2] (take n (iterate inc 3))))


(create-primes 50)
