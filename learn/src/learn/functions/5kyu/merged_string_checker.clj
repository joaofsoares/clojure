(ns learn.functions.5kyu.merged-string-checker)

(defn is-merge [s p1 p2]
  (let [hs (first s)
        hp1 (first p1)
        hp2 (first p2)]
    (cond
      (empty? p1) (= (apply str s) (apply str p2))
      (empty? p2) (= (apply str s) (apply str p1))
      (empty? s) (= (str p1 p2) "")
      (= hs hp1 hp2) (or (is-merge (rest s) (rest p1) p2) (is-merge (rest s) p1 (rest p2)))
      (= hs hp1) (recur (rest s) (rest p1) p2)
      (= hs hp2) (recur (rest s) p1 (rest p2))
      :else false)))

(is-merge "codewars" "code" "wars")
(is-merge "codewars" "cdw" "oears")

(is-merge "codewars" "cod" "wars")
(is-merge "codewars" "codes" "wars")

(is-merge "Bananas from Bahamas" "Bahas" "Bananas from am")
(is-merge "Bananas from Bahamas" "Bananas from am" "Bahas")

(is-merge "M)87cdY5AZL+)1f2(\"+IP;X[6!w^7$Mto)';n:Q'4=e[cM)87cdY5AZL+)1f2(\"+IP;X[6\"HH%nB7'X!Ym+<S1ZJ?=CT*j$9K.VSf" "M)87cdY5AZL+)1f2(\"+IP;X[6\"HH%nB7'X!Ym" "M)87cdY5AZL+)1f2(\"+IP;X[6!w^7$Mto)';n:Q'4=e[c+<S1ZJ?=CT*j$9K.VSf")

(is-merge "codewars" "code" "wasr")
(is-merge "codewars" "cwdr" "oeas")
