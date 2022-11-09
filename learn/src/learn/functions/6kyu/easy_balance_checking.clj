(ns learn.functions.6kyu.easy-balance-checking
  (:require [clojure.string :as str]))

(defn- get-decimal
  [d]
  (Double/parseDouble (re-find #"\d+.\d+" d)))

(defn- format-num
  [n]
  (re-find #"\d+" n))

(defn- format-txt
  [s]
  (re-find #"[A-Za-z]+" s))

(defn- round-decimal
  [d]
  (format "%.2f" d))

(defn- get-format
  [s price debt]
  (let [init (format-num (first s))
        mid (format-txt (second s))]
    (str/join " " [init mid (round-decimal price) "Balance" (round-decimal debt)])))

(defn- format-lines
  [lines balance]
  (let [b (atom balance)]
    (for [i (range 0 (count lines))]
      (let [line (nth lines i)
            ss (take 3 (str/split line #" "))
            price (get-decimal (last ss))
            debt (- @b price)]
        (reset! b debt)
        (get-format ss price debt)))))

(defn- calc-expense
  [values]
  (let [cnt (count values)
        t (reduce + (map #(Double/parseDouble (nth (str/split % #" ") 2)) values))]
    [t (/ t cnt)]))

(defn balance [book]
  (let [ss (str/split-lines book)
        b (get-decimal (first ss))
        ls (format-lines (rest ss) b)
        [totale avge] (calc-expense ls)]
    (str (str "Original Balance: " (round-decimal b) "\n")
         (apply str (str/join "\n" ls))
         (str "\nTotal expense  " (round-decimal totale))
         (str "\nAverage expense  " (round-decimal avge)))))

(balance "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10")
(balance "1233.00\n125 Hardware;! 24.80?\n123 Flowers 93.50;\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n123 Photos;! 71.40?\n122 Picture 93.50\n132 Tyres;! 19.00 ?;\n129 Stamps; 13.60\n129 Fruits{} 17.60\n129 Market;! 128.00?\n121 Gasoline;! 13.60?")
