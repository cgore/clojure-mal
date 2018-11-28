(ns clojure-mal.step1)

(defn reader []
  (read-line))

(defn printer [result]
  (println "OKAY ...")
  (println result))

(defn repl-loop []
  (println "HOWDY >")
  (let [input-line (reader)]
    (when input-line
      (printer input-line)
      (recur))))

(defn -main [& args]
  (repl-loop))
