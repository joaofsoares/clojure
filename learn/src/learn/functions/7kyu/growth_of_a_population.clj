(ns learn.functions.7kyu.growth-of-a-population)

(defn- nb-year-helper [p0 percent aug p ys]
  (if (>= p0 p)
    ys
    (nb-year-helper (+ (int p0) (* (int p0) (double (/ percent 100))) aug) percent aug p (inc ys))))

(defn nb-year [p0 percent aug p]
  (nb-year-helper p0 percent aug p 0))
