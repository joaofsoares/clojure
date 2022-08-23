(ns learn.functions.8kyu.rock-paper-scissors)

(def playerWin #{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]})

(defn rps [p1 p2]
  (cond
    (= p1 p2) "Draw!"
    (playerWin [p1 p2]) "Player 1 won!"
    :else "Player 2 won!"))
