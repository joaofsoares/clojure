(ns learn.functions.7kyu.string-ends-with
  (:require [clojure.string :as str]))

(defn solution [s ending]
  (str/ends-with? s ending))

(solution "samurai" "ai")
