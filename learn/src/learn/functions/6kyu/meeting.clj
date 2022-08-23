(ns learn.functions.6kyu.meeting
  (:require [clojure.string :as str]))

(defn- convert-to-string [contact]
  (str "(" (first contact) ", " (second contact) ")"))

(defn meeting [s]
  (->> (str/split s #";")
       (map str/upper-case)
       (map #(into () (str/split % #":")))
       (sort-by (juxt first second))
       (map convert-to-string)
       (apply str)))

(meeting "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn")
(meeting "John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell")
(meeting "John:Gates;Michael:Wahl;Janne:Gates")
(meeting "Paul:Arno;Ann:Arno")

; "(ARNO, PAUL)(ARNO, ANN)(CORNWELL, AMBER)(META, AMANDY)(META, GRACE)(RUDD, JACOB)(SCHWARZ, MATTHEW)(SCHWARZ, ALEX)"
; "(ARNO, ANN)(ARNO, PAUL)(CORNWELL, AMBER)(META, AMANDY)(META, GRACE)(RUDD, JACOB)(SCHWARZ, ALEX)(SCHWARZ, MATTHEW)"
