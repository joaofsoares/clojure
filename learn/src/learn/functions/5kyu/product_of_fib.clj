(ns learn.functions.5kyu.product-of-fib)

(def fibonacci
  ((fn fib [a b]
     (lazy-seq (cons a (fib b (+ (bigint a) b)))))
   0 1))

(nth fibonacci 10)

(defn product-fib [prod]
  (loop [x 0]

    (def fst
      (nth fibonacci x))

    (def snd
      (nth fibonacci (inc x)))

    (cond
      (= (* fst snd) prod) [fst snd true]
      (> (* fst snd) prod) [fst snd false]
      :else (recur (inc x)))))

(product-fib 714)
(product-fib 800)
(product-fib 4895)
(product-fib 5895)
