(ns clojure-mal.step1)

(defn reader []
  (read-line))

(defn printer [result]
  (println "OKAY ...")
  (println result))

(defn evaluator [input]
  (let [result input]
    result))

(defn repl-loop []
  (println "HOWDY >")
  (let [input (reader)]
    (when input
      (printer (evaluator input))
      (recur))))

(defn -main [& args]
  (repl-loop))
